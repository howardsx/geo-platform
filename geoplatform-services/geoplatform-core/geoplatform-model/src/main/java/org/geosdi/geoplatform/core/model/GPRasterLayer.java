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
package org.geosdi.geoplatform.core.model;

import org.geosdi.geoplatform.gui.shared.GPLayerType;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Francesco Izzi - CNR IMAA - geoSDI
 */
@XmlRootElement(name = "RasterLayer")
@Entity(name = "RasterLayer")
@Table(name = "gp_raster_layer", indexes = {
        @Index(columnList = "project_id", name = "RASTER_PROJECT_ID_INDEX")
})
public class GPRasterLayer extends GPLayer {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1852288981980627642L;
    //
    @Column
    private float opacity = 1.0f;
    // The character , separated list of styles
    @Column(length = 500, columnDefinition = "TEXT")
    private String styles;
    //
    @Embedded
    private GPLayerInfo layerInfo;
    //
    @Column(name = "max_scale")
    private Float maxScale;
    //
    @Column(name = "min_scale")
    private Float minScale;
    //
    @ManyToOne(optional = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private GPFolder folder;
    //
    @ManyToOne(optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private GPProject project;

    public GPRasterLayer() {
        super.setLayerType(GPLayerType.WMS);
    }

    /**
     * @return the opacity
     */
    public float getOpacity() {
        return opacity;
    }

    /**
     * @param opacity the opacity to set
     */
    public void setOpacity(float opacity) {
        if (opacity < 0.0f || opacity > 1.0f) {
            throw new IllegalArgumentException(
                    "The opacity must be between 0.0 and 1.0");
        }
        this.opacity = opacity;
    }

    /**
     * @return the styles
     */
    public List<String> getStyles() {
        if (styles == null) {
            return new ArrayList<String>(0);
        }
        return Arrays.asList(styles.split(","));
    }

    /**
     * @param styles the styles to set
     */
    public void setStyles(List<String> styles) {
        if (styles == null || styles.isEmpty()) {
            this.styles = null;
            return;
        }

        StringBuilder str = new StringBuilder();
        for (String style : styles) {
            str.append(style).append(",");
        }
        str.deleteCharAt(str.length() - 1);
        this.styles = str.toString();
    }

    /**
     * @return the layerInfo
     */
    public GPLayerInfo getLayerInfo() {
        return layerInfo;
    }

    /**
     * @param layerInfo the layerInfo to set
     */
    public void setLayerInfo(GPLayerInfo layerInfo) {
        this.layerInfo = layerInfo;
    }

    /**
     * @return the maxScale
     */
    public Float getMaxScale() {
        return maxScale;
    }

    /**
     * @param maxScale the maxScale to set
     */
    public void setMaxScale(Float maxScale) {
        this.maxScale = maxScale;
    }

    /**
     * @return the minScale
     */
    public Float getMinScale() {
        return minScale;
    }

    /**
     * @param minScale the minScale to set
     */
    public void setMinScale(Float minScale) {
        this.minScale = minScale;
    }

    /**
     * @return the folder
     */
    @Override
    public GPFolder getFolder() {
        return this.folder;
    }

    /**
     * @param folder the folder to set
     */
    @Override
    public void setFolder(GPFolder folder) {
        this.folder = folder;
    }

    /**
     * @return the project
     */
    @Override
    public GPProject getProject() {
        return this.project;
    }

    /**
     * @param project the project to set
     */
    @Override
    public void setProject(GPProject project) {
        this.project = project;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(this.getClass().getSimpleName()).append(
                " {");
        str.append(super.toString());
        str.append(", opacity = ").append(opacity);
        str.append(", styles = ").append(styles);
        str.append(", layerInfo = ").append(layerInfo);
        str.append(", maxScale = ").append(maxScale);
        str.append(", minScale = ").append(minScale);
        return str.append("}").toString();
    }

}
