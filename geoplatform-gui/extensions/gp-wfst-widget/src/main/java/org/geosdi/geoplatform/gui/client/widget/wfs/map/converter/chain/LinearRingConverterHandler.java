/**
 *
 *    geo-platform
 *    Rich webgis framework
 *    http://geo-platform.org
 *   ====================================================================
 *
 *   Copyright (C) 2008-2019 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 *   This program is free software: you can redistribute it and/or modify it
 *   under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version. This program is distributed in the
 *   hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *   even the implied warranty of MERCHANTABILITY or FITNESS FOR
 *   A PARTICULAR PURPOSE. See the GNU General Public License
 *   for more details. You should have received a copy of the GNU General
 *   Public License along with this program. If not, see http://www.gnu.org/licenses/
 *
 *   ====================================================================
 *
 *   Linking this library statically or dynamically with other modules is
 *   making a combined work based on this library. Thus, the terms and
 *   conditions of the GNU General Public License cover the whole combination.
 *
 *   As a special exception, the copyright holders of this library give you permission
 *   to link this library with independent modules to produce an executable, regardless
 *   of the license terms of these independent modules, and to copy and distribute
 *   the resulting executable under terms of your choice, provided that you also meet,
 *   for each linked independent module, the terms and conditions of the license of
 *   that module. An independent module is a module which is not derived from or
 *   based on this library. If you modify this library, you may extend this exception
 *   to your version of the library, but you are not obligated to do so. If you do not
 *   wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.gui.client.widget.wfs.map.converter.chain;

import org.geosdi.geoplatform.gui.client.editor.map.converter.chain.BaseConverterHandler;
import org.gwtopenmaps.openlayers.client.MapWidget;
import org.gwtopenmaps.openlayers.client.Projection;
import org.gwtopenmaps.openlayers.client.geometry.Geometry;
import org.gwtopenmaps.openlayers.client.geometry.LinearRing;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
class LinearRingConverterHandler extends BaseConverterHandler {

    public LinearRingConverterHandler(MapWidget theMapWidget) {
        super(theMapWidget);

        super.setSuccessor(new PolygonConverterHandler(theMapWidget));
    }

    @Override
    protected String generateGeometryWKT(Geometry geom, Projection dest) {
        LinearRing linearRing = LinearRing.narrowToLinearRing(geom.getJSObject());
        linearRing.transform(new Projection(mapWidget.getMap().getProjection()),
                dest);

        return linearRing.toString();
    }

    @Override
    public String convertRequest(Geometry geom, Projection dest) {
        return (isPossibleToConvert(geom)) ? generateGeometryWKT(geom, dest)
                : super.forwardConvertRequest(geom, dest);
    }

    @Override
    protected boolean isPossibleToConvert(Geometry geom) {
        return geom.getClassName().equalsIgnoreCase(
                Geometry.LINEARRING_CLASS_NAME);
    }

}
