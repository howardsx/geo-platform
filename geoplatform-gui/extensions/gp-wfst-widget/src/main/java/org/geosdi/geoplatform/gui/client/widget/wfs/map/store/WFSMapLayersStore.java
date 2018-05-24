/**
 * geo-platform
 * Rich webgis framework
 * http://geo-platform.org
 * ====================================================================
 * <p>
 * Copyright (C) 2008-2018 geoSDI Group (CNR IMAA - Potenza - ITALY).
 * <p>
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details. You should have received a copy of the GNU General
 * Public License along with this program. If not, see http://www.gnu.org/licenses/
 * <p>
 * ====================================================================
 * <p>
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library. Thus, the terms and
 * conditions of the GNU General Public License cover the whole combination.
 * <p>
 * As a special exception, the copyright holders of this library give you permission
 * to link this library with independent modules to produce an executable, regardless
 * of the license terms of these independent modules, and to copy and distribute
 * the resulting executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the license of
 * that module. An independent module is a module which is not derived from or
 * based on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obligated to do so. If you do not
 * wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.gui.client.widget.wfs.map.store;

import com.extjs.gxt.ui.client.Registry;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.History;
import org.geosdi.geoplatform.gui.client.puregwt.map.WFSLayerMapChangedHandler;
import org.geosdi.geoplatform.gui.client.widget.map.event.LayerRangeEvent;
import org.geosdi.geoplatform.gui.configuration.users.options.member.UserSessionEnum;
import org.geosdi.geoplatform.gui.global.security.IGPAccountDetail;
import org.geosdi.geoplatform.gui.impl.map.store.GPMapLayersStore;
import org.geosdi.geoplatform.gui.model.GPLayerBean;
import org.geosdi.geoplatform.gui.model.GPRasterBean;
import org.geosdi.geoplatform.gui.model.GPVectorBean;
import org.geosdi.geoplatform.gui.model.tree.GPLayerTreeModel;
import org.geosdi.geoplatform.gui.puregwt.GPEventBus;
import org.geosdi.geoplatform.gui.puregwt.GPHandlerManager;
import org.geosdi.geoplatform.gui.puregwt.layers.LayerHandlerManager;
import org.geosdi.geoplatform.gui.shared.util.GPSharedUtils;
import org.gwtopenmaps.openlayers.client.MapWidget;
import org.gwtopenmaps.openlayers.client.Projection;
import org.gwtopenmaps.openlayers.client.layer.Layer;
import org.gwtopenmaps.openlayers.client.layer.WMS;
import org.gwtopenmaps.openlayers.client.layer.WMSOptions;
import org.gwtopenmaps.openlayers.client.layer.WMSParams;

import java.util.Map.Entry;
import java.util.logging.Logger;

/**
 * @author Vito Salvia - CNR IMAA geoSDI Group
 * @email vito.salvia@gmail.com
 */
public class WFSMapLayersStore extends GPMapLayersStore<GPLayerBean, Layer> implements WFSLayerMapChangedHandler {

    protected final static Logger logger = Logger.getLogger("");

    private final WFSMapLayerBuilder layerBuilder;

    public WFSMapLayersStore(MapWidget theMapWidget) {
        super(theMapWidget);
        this.layerBuilder = new WFSMapLayerBuilder(theMapWidget);
        GPHandlerManager.addHandler(WFSLayerMapChangedHandler.TYPE,this);
    }

    @Override
    public boolean containsLayer(GPLayerBean key) {
        return this.layers.containsKey(key);
    }

    @Override
    public GPLayerBean getLayer(Layer value) {
        GPLayerBean layerToReturn = null;
        for (Entry<GPLayerBean, Layer> layer : GPSharedUtils.safeCollection(
                this.layers.entrySet())) {
            if (layer.getValue().getId().equals(value.getId())) {
                layerToReturn = layer.getKey();
                break;
            }
        }
        return layerToReturn;
    }

    @Override
    public Layer getLayer(GPLayerBean key) {
        return this.layers.get(key);
    }

    @Override
    public void onDisplayLayer(GPLayerBean layerBean) {
        super.displayLayer(layerBean);
    }

    @Override
    public void onHideLayer(GPLayerBean layerBean) {
        this.hideLayer(layerBean);
    }

    @Override
    public void onRemoveLayer(GPLayerBean layerBean) {
        this.removeLayer(layerBean);
    }

    @Override
    public void reloadLayer(GPLayerBean layer) {
        WMS wmsLayer = (WMS) this.layers.get(layer);
        if (wmsLayer != null) {
            logger.finest("REDRAW layer: " + layer.getTitle());
            wmsLayer.redraw(true);
        }
    }

    @Override
    public void displayVector(GPVectorBean vectorBean) {
    }

    @Override
    public void displayRaster(GPRasterBean rasterBean) {
        final WMS layer;
        if (containsLayer(rasterBean)) {
            layer = (WMS) this.layers.get(rasterBean);
            if (!layer.isVisible() || Integer.parseInt(
                    layer.getZIndex().toString())
                    != rasterBean.getzIndex()) {
                layer.setZIndex(rasterBean.getzIndex());
                Scheduler.get().scheduleDeferred(new Command() {
                    @Override
                    public void execute() {
                        layer.setIsVisible(true);
                        layer.redraw(true);
                    }
                });
            }
        } else {
            layer = (WMS) this.layerBuilder.buildLayer(rasterBean);
            this.layers.put(rasterBean, layer);
            this.mapWidget.getMap().addLayer(layer);
            layer.setZIndex(rasterBean.getzIndex());
            layer.redraw(true);
        }
    }

    @Override
    public void hideLayer(GPLayerBean layerBean) {
        final Layer layer = getLayer(layerBean);
        if (layer != null) {
            Scheduler.get().scheduleDeferred(new Command() {
                @Override
                public void execute() {
                    layer.setIsVisible(false);
                }
            });
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.geosdi.geoplatform.gui.impl.map.store.ILayersStore#removeLayer(org
     * .geosdi.geoplatform.gui.model.GPLayerBean)
     */
    @Override
    public void removeLayer(GPLayerBean layerBean) {
    }

    @Override
    public void onChangeStyle(GPRasterBean layerBean,
                              String newStyle) {
    }

    @Override
    public void onChangeSingleTileRequest(GPRasterBean layerBean,
                                          boolean singleTileRequest) {
    }

    @Override
    public void onChangeCqlFilter(GPLayerTreeModel layerBean) {
    }

    @Override
    public void onChangeTimeFilter(GPLayerTreeModel layerBean) {
    }

    @Override
    public void changeOpacity(GPRasterBean layerBean) {
    }

    @Override
    public void changeMaxScale(GPRasterBean layerBean, Float maxScale) {
    }

    @Override
    public void changeMinScale(GPRasterBean layerBean, Float minScale) {
    }

    @Override
    public void resetStore() {
    }

    @Override
    public void onReloadLayer(GPLayerBean layerBean) {
    }

    @Override
    public void onChangeBaseLayer(Projection projection) {
    }

}