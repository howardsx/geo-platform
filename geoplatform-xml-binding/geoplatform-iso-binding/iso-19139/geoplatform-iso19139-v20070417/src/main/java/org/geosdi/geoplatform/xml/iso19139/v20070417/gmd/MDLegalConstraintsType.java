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
// Generated on: 2012.04.18 at 03:12:11 PM CEST 
//


package org.geosdi.geoplatform.xml.iso19139.v20070417.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20070417.gco.CharacterStringPropertyType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Restrictions and legal prerequisites for accessing and using the dataset.
 * 
 * <p>Java class for MD_LegalConstraints_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_LegalConstraints_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_Constraints_Type">
 *       &lt;sequence>
 *         &lt;element name="accessConstraints" type="{http://www.isotc211.org/2005/gmd}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useConstraints" type="{http://www.isotc211.org/2005/gmd}MD_RestrictionCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherConstraints" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_LegalConstraints_Type", propOrder = {
    "accessConstraints",
    "useConstraints",
    "otherConstraints"
})
public class MDLegalConstraintsType
    extends MDConstraintsType
    implements ToString
{

    protected List<MDRestrictionCodePropertyType> accessConstraints;
    protected List<MDRestrictionCodePropertyType> useConstraints;
    protected List<CharacterStringPropertyType> otherConstraints;

    /**
     * Gets the value of the accessConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getAccessConstraints() {
        if (accessConstraints == null) {
            accessConstraints = new ArrayList<MDRestrictionCodePropertyType>();
        }
        return this.accessConstraints;
    }

    public boolean isSetAccessConstraints() {
        return ((this.accessConstraints!= null)&&(!this.accessConstraints.isEmpty()));
    }

    public void unsetAccessConstraints() {
        this.accessConstraints = null;
    }

    /**
     * Gets the value of the useConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRestrictionCodePropertyType }
     * 
     * 
     */
    public List<MDRestrictionCodePropertyType> getUseConstraints() {
        if (useConstraints == null) {
            useConstraints = new ArrayList<MDRestrictionCodePropertyType>();
        }
        return this.useConstraints;
    }

    public boolean isSetUseConstraints() {
        return ((this.useConstraints!= null)&&(!this.useConstraints.isEmpty()));
    }

    public void unsetUseConstraints() {
        this.useConstraints = null;
    }

    /**
     * Gets the value of the otherConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getOtherConstraints() {
        if (otherConstraints == null) {
            otherConstraints = new ArrayList<CharacterStringPropertyType>();
        }
        return this.otherConstraints;
    }

    public boolean isSetOtherConstraints() {
        return ((this.otherConstraints!= null)&&(!this.otherConstraints.isEmpty()));
    }

    public void unsetOtherConstraints() {
        this.otherConstraints = null;
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
            List<MDRestrictionCodePropertyType> theAccessConstraints;
            theAccessConstraints = (this.isSetAccessConstraints()?this.getAccessConstraints():null);
            strategy.appendField(locator, this, "accessConstraints", buffer, theAccessConstraints);
        }
        {
            List<MDRestrictionCodePropertyType> theUseConstraints;
            theUseConstraints = (this.isSetUseConstraints()?this.getUseConstraints():null);
            strategy.appendField(locator, this, "useConstraints", buffer, theUseConstraints);
        }
        {
            List<CharacterStringPropertyType> theOtherConstraints;
            theOtherConstraints = (this.isSetOtherConstraints()?this.getOtherConstraints():null);
            strategy.appendField(locator, this, "otherConstraints", buffer, theOtherConstraints);
        }
        return buffer;
    }

    public void setAccessConstraints(List<MDRestrictionCodePropertyType> value) {
        this.accessConstraints = null;
        List<MDRestrictionCodePropertyType> draftl = this.getAccessConstraints();
        draftl.addAll(value);
    }

    public void setUseConstraints(List<MDRestrictionCodePropertyType> value) {
        this.useConstraints = null;
        List<MDRestrictionCodePropertyType> draftl = this.getUseConstraints();
        draftl.addAll(value);
    }

    public void setOtherConstraints(List<CharacterStringPropertyType> value) {
        this.otherConstraints = null;
        List<CharacterStringPropertyType> draftl = this.getOtherConstraints();
        draftl.addAll(value);
    }

}
