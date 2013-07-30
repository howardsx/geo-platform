/*
 *  geo-platform
 *  Rich webgis framework
 *  http://geo-platform.org
 * ====================================================================
 *
 * Copyright (C) 2008-2013 geoSDI Group (CNR IMAA - Potenza - ITALY).
 *
 * This program is free software: you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. This program is distributed in the 
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR 
 * A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details. You should have received a copy of the GNU General 
 * Public License along with this program. If not, see http://www.gnu.org/licenses/ 
 *
 * ====================================================================
 *
 * Linking this library statically or dynamically with other modules is 
 * making a combined work based on this library. Thus, the terms and 
 * conditions of the GNU General Public License cover the whole combination. 
 * 
 * As a special exception, the copyright holders of this library give you permission 
 * to link this library with independent modules to produce an executable, regardless 
 * of the license terms of these independent modules, and to copy and distribute 
 * the resulting executable under terms of your choice, provided that you also meet, 
 * for each linked independent module, the terms and conditions of the license of 
 * that module. An independent module is a module which is not derived from or 
 * based on this library. If you modify this library, you may extend this exception 
 * to your version of the library, but you are not obligated to do so. If you do not 
 * wish to do so, delete this exception statement from your version. 
 *
 */
package org.geosdi.geoplatform.gui.client.widget.wfs.uibinder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Widget;
import javax.inject.Inject;
import org.geosdi.geoplatform.gui.client.config.annotation.DragFeatureToggleButton;
import org.geosdi.geoplatform.gui.client.config.annotation.EditFeatureToggleButton;
import org.geosdi.geoplatform.gui.client.config.annotation.GetFeatureToggleButton;
import org.geosdi.geoplatform.gui.client.config.annotation.ReshapeFeatureToggleButton;
import org.geosdi.geoplatform.gui.client.config.annotation.ResizeFeatureToggleButton;
import org.geosdi.geoplatform.gui.client.config.annotation.RotateFeatureToggleButton;
import org.geosdi.geoplatform.gui.configuration.resources.GeoPlatformStyleInjector;

/**
 * @author Francesco Izzi - CNR IMAA geoSDI Group
 * @email francesco.izzi@geosdi.org
 *
 */
public class EditingToolBarDialog extends Composite {

    interface Binder extends UiBinder<Widget, EditingToolBarDialog> {
    }

    private static final Binder binder = GWT.create(Binder.class);
    //
    @UiField
    FlowPanel toolbarEditorPanel;

    @Inject
    public EditingToolBarDialog(@DragFeatureToggleButton ToggleButton drag,
            @EditFeatureToggleButton ToggleButton edit,
            @GetFeatureToggleButton ToggleButton info,
            @ReshapeFeatureToggleButton ToggleButton reshape,
            @ResizeFeatureToggleButton ToggleButton resize,
            @RotateFeatureToggleButton ToggleButton rotate) {

        GeoPlatformStyleInjector.injectCss(
                ResourceEditingToolBar.INSTANCE.wfstCss());

        initWidget(binder.createAndBindUi(this));

        toolbarEditorPanel.add(info);
        toolbarEditorPanel.add(edit);
        toolbarEditorPanel.add(reshape);
        toolbarEditorPanel.add(rotate);
        toolbarEditorPanel.add(drag);
        toolbarEditorPanel.add(resize);

    }

}
