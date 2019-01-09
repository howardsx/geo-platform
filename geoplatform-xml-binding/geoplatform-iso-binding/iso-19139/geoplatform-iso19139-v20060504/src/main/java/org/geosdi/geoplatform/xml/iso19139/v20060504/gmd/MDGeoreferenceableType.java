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
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.17 at 04:41:23 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20060504.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.BooleanPropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.CharacterStringPropertyType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gco.RecordPropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for MD_Georeferenceable_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Georeferenceable_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_GridSpatialRepresentation_Type">
 *       &lt;sequence>
 *         &lt;element name="controlPointAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="orientationParameterAvailability" type="{http://www.isotc211.org/2005/gco}Boolean_PropertyType"/>
 *         &lt;element name="orientationParameterDescription" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="georeferencedParameters" type="{http://www.isotc211.org/2005/gco}Record_PropertyType"/>
 *         &lt;element name="parameterCitation" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Georeferenceable_Type", propOrder = {
    "controlPointAvailability",
    "orientationParameterAvailability",
    "orientationParameterDescription",
    "georeferencedParameters",
    "parameterCitation"
})
public class MDGeoreferenceableType
    extends MDGridSpatialRepresentationType
    implements ToString
{

    @XmlElement(required = true)
    protected BooleanPropertyType controlPointAvailability;
    @XmlElement(required = true)
    protected BooleanPropertyType orientationParameterAvailability;
    protected CharacterStringPropertyType orientationParameterDescription;
    @XmlElement(required = true)
    protected RecordPropertyType georeferencedParameters;
    protected List<CICitationPropertyType> parameterCitation;

    /**
     * Gets the value of the controlPointAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getControlPointAvailability() {
        return controlPointAvailability;
    }

    /**
     * Sets the value of the controlPointAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setControlPointAvailability(BooleanPropertyType value) {
        this.controlPointAvailability = value;
    }

    public boolean isSetControlPointAvailability() {
        return (this.controlPointAvailability!= null);
    }

    /**
     * Gets the value of the orientationParameterAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanPropertyType }
     *     
     */
    public BooleanPropertyType getOrientationParameterAvailability() {
        return orientationParameterAvailability;
    }

    /**
     * Sets the value of the orientationParameterAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanPropertyType }
     *     
     */
    public void setOrientationParameterAvailability(BooleanPropertyType value) {
        this.orientationParameterAvailability = value;
    }

    public boolean isSetOrientationParameterAvailability() {
        return (this.orientationParameterAvailability!= null);
    }

    /**
     * Gets the value of the orientationParameterDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrientationParameterDescription() {
        return orientationParameterDescription;
    }

    /**
     * Sets the value of the orientationParameterDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrientationParameterDescription(CharacterStringPropertyType value) {
        this.orientationParameterDescription = value;
    }

    public boolean isSetOrientationParameterDescription() {
        return (this.orientationParameterDescription!= null);
    }

    /**
     * Gets the value of the georeferencedParameters property.
     * 
     * @return
     *     possible object is
     *     {@link RecordPropertyType }
     *     
     */
    public RecordPropertyType getGeoreferencedParameters() {
        return georeferencedParameters;
    }

    /**
     * Sets the value of the georeferencedParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordPropertyType }
     *     
     */
    public void setGeoreferencedParameters(RecordPropertyType value) {
        this.georeferencedParameters = value;
    }

    public boolean isSetGeoreferencedParameters() {
        return (this.georeferencedParameters!= null);
    }

    /**
     * Gets the value of the parameterCitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterCitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterCitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICitationPropertyType }
     * 
     * 
     */
    public List<CICitationPropertyType> getParameterCitation() {
        if (parameterCitation == null) {
            parameterCitation = new ArrayList<CICitationPropertyType>();
        }
        return this.parameterCitation;
    }

    public boolean isSetParameterCitation() {
        return ((this.parameterCitation!= null)&&(!this.parameterCitation.isEmpty()));
    }

    public void unsetParameterCitation() {
        this.parameterCitation = null;
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
        super.appendFields(locator, buffer, strategy);
        {
            BooleanPropertyType theControlPointAvailability;
            theControlPointAvailability = this.getControlPointAvailability();
            strategy.appendField(locator, this, "controlPointAvailability", buffer, theControlPointAvailability);
        }
        {
            BooleanPropertyType theOrientationParameterAvailability;
            theOrientationParameterAvailability = this.getOrientationParameterAvailability();
            strategy.appendField(locator, this, "orientationParameterAvailability", buffer, theOrientationParameterAvailability);
        }
        {
            CharacterStringPropertyType theOrientationParameterDescription;
            theOrientationParameterDescription = this.getOrientationParameterDescription();
            strategy.appendField(locator, this, "orientationParameterDescription", buffer, theOrientationParameterDescription);
        }
        {
            RecordPropertyType theGeoreferencedParameters;
            theGeoreferencedParameters = this.getGeoreferencedParameters();
            strategy.appendField(locator, this, "georeferencedParameters", buffer, theGeoreferencedParameters);
        }
        {
            List<CICitationPropertyType> theParameterCitation;
            theParameterCitation = (this.isSetParameterCitation()?this.getParameterCitation():null);
            strategy.appendField(locator, this, "parameterCitation", buffer, theParameterCitation);
        }
        return buffer;
    }

    public void setParameterCitation(List<CICitationPropertyType> value) {
        this.parameterCitation = null;
        List<CICitationPropertyType> draftl = this.getParameterCitation();
        draftl.addAll(value);
    }

}
