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
//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.08.25 alle 11:12:35 PM CEST 
//


package org.geosdi.geoplatform.xml.sld.v100;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/sld}AnchorPoint" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/sld}Displacement" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/sld}Rotation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "anchorPoint",
    "displacement",
    "rotation"
})
@XmlRootElement(name = "PointPlacement")
public class PointPlacementElement
    implements ToString
{

    @XmlElement(name = "AnchorPoint")
    protected AnchorPointElement anchorPoint;
    @XmlElement(name = "Displacement")
    protected DisplacementElement displacement;
    @XmlElement(name = "Rotation")
    protected ParameterValueType rotation;

    /**
     * Recupera il valore della proprietà anchorPoint.
     * 
     * @return
     *     possible object is
     *     {@link AnchorPointElement }
     *     
     */
    public AnchorPointElement getAnchorPoint() {
        return anchorPoint;
    }

    /**
     * Imposta il valore della proprietà anchorPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link AnchorPointElement }
     *     
     */
    public void setAnchorPoint(AnchorPointElement value) {
        this.anchorPoint = value;
    }

    public boolean isSetAnchorPoint() {
        return (this.anchorPoint!= null);
    }

    /**
     * Recupera il valore della proprietà displacement.
     * 
     * @return
     *     possible object is
     *     {@link DisplacementElement }
     *     
     */
    public DisplacementElement getDisplacement() {
        return displacement;
    }

    /**
     * Imposta il valore della proprietà displacement.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplacementElement }
     *     
     */
    public void setDisplacement(DisplacementElement value) {
        this.displacement = value;
    }

    public boolean isSetDisplacement() {
        return (this.displacement!= null);
    }

    /**
     * Recupera il valore della proprietà rotation.
     * 
     * @return
     *     possible object is
     *     {@link ParameterValueType }
     *     
     */
    public ParameterValueType getRotation() {
        return rotation;
    }

    /**
     * Imposta il valore della proprietà rotation.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterValueType }
     *     
     */
    public void setRotation(ParameterValueType value) {
        this.rotation = value;
    }

    public boolean isSetRotation() {
        return (this.rotation!= null);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            AnchorPointElement theAnchorPoint;
            theAnchorPoint = this.getAnchorPoint();
            strategy.appendField(locator, this, "anchorPoint", buffer, theAnchorPoint);
        }
        {
            DisplacementElement theDisplacement;
            theDisplacement = this.getDisplacement();
            strategy.appendField(locator, this, "displacement", buffer, theDisplacement);
        }
        {
            ParameterValueType theRotation;
            theRotation = this.getRotation();
            strategy.appendField(locator, this, "rotation", buffer, theRotation);
        }
        return buffer;
    }

}
