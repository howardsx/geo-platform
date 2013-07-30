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
package org.geosdi.geoplatform.gui.client.widget.cql.button;

import com.extjs.gxt.ui.client.event.BaseEvent;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.widget.Label;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.TextArea;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import org.geosdi.geoplatform.gui.client.widget.GeoPlatformWindow;

/**
 * @author Nazzareno Sileno - CNR IMAA geoSDI Group
 * @email nazzareno.sileno@geosdi.org
 */
public class BetweenCQLButton extends AdvancedCQLButton {

    private TextField<String> comparisonParameter = new TextField<String>();
    private TextField<String> firstParameter = new TextField<String>();
    private TextField<String> secondParameter = new TextField<String>();
    private FormData formData;

    public BetweenCQLButton(TextArea textArea) {
        super(textArea, "BETWEEN");
        super.setTitle("Tests whether a value lies in or outside a range (inclusive), "
                + "can be joined whit NOT operator");
    }

    @Override
    protected void initialize() {
        this.formData = new FormData("98%");
        this.comparisonParameter.setFieldLabel("Comparison Parameter");
        this.firstParameter.setFieldLabel("First Parameter");
        this.secondParameter.setFieldLabel("Second Parameter");
        final Button insertButton = new Button("Insert", new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent be) {
                BetweenCQLButton.super.insertTextIntoFilterArea(comparisonParameter.getValue()
                        + " BETWEEN " + firstParameter.getValue() + " AND " + secondParameter.getValue());
                window.hide();
            }
        });
        super.window = new GeoPlatformWindow(true) {
            @Override
            public void addComponent() {
                add(new Label("Please, insert the required parameters."));
                add(comparisonParameter, formData);
                add(firstParameter, formData);
                add(secondParameter, formData);
                add(new Label("The result will be: 'Comparison parameter BETWEEN First Parameter AND Second Parameter'"));
                insertButton.disable();
                addButton(insertButton);
            }

            @Override
            public void initSize() {
                super.setSize("300", "220");
            }

            @Override
            public void setWindowProperties() {
                super.setHeadingHtml("Between Parameter Selection");
                super.setLayout(new FormLayout());
            }
        };

        Listener listener = new Listener<BaseEvent>() {
            @Override
            public void handleEvent(BaseEvent be) {
                String comparisonValue = comparisonParameter.getValue();
                String firstValue = firstParameter.getValue();
                String secondValue = secondParameter.getValue();
                if (comparisonValue == null || comparisonValue.trim().equals("")
                        || firstValue == null || firstValue.trim().equals("")
                        || secondValue == null || secondValue.trim().equals("")) {
                    insertButton.disable();
                } else {
                    insertButton.enable();
                }
            }
        };

        comparisonParameter.addListener(Events.OnKeyUp, listener);
        firstParameter.addListener(Events.OnKeyUp, listener);
        secondParameter.addListener(Events.OnKeyUp, listener);
        super.initialized = Boolean.TRUE;
    }
}
