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


package org.geosdi.geoplatform.xml.iso19139.v20060504.gmx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.geosdi.geoplatform.xml.iso19139.v20060504.gmd.DSDataSetType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for MX_DataSet_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MX_DataSet_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}DS_DataSet_Type">
 *       &lt;sequence>
 *         &lt;element name="dataFile" type="{http://www.isotc211.org/2005/gmx}MX_DataFile_PropertyType" maxOccurs="unbounded"/>
 *         &lt;element name="datasetCatalogue" type="{http://www.isotc211.org/2005/gmx}CT_Catalogue_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supportFile" type="{http://www.isotc211.org/2005/gmx}MX_SupportFile_PropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MX_DataSet_Type", propOrder = {
    "dataFile",
    "datasetCatalogue",
    "supportFile"
})
public class MXDataSetType
    extends DSDataSetType
    implements ToString
{

    @XmlElement(required = true)
    protected List<MXDataFilePropertyType> dataFile;
    protected List<CTCataloguePropertyType> datasetCatalogue;
    protected List<MXSupportFilePropertyType> supportFile;

    /**
     * Gets the value of the dataFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXDataFilePropertyType }
     * 
     * 
     */
    public List<MXDataFilePropertyType> getDataFile() {
        if (dataFile == null) {
            dataFile = new ArrayList<MXDataFilePropertyType>();
        }
        return this.dataFile;
    }

    public boolean isSetDataFile() {
        return ((this.dataFile!= null)&&(!this.dataFile.isEmpty()));
    }

    public void unsetDataFile() {
        this.dataFile = null;
    }

    /**
     * Gets the value of the datasetCatalogue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetCatalogue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetCatalogue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTCataloguePropertyType }
     * 
     * 
     */
    public List<CTCataloguePropertyType> getDatasetCatalogue() {
        if (datasetCatalogue == null) {
            datasetCatalogue = new ArrayList<CTCataloguePropertyType>();
        }
        return this.datasetCatalogue;
    }

    public boolean isSetDatasetCatalogue() {
        return ((this.datasetCatalogue!= null)&&(!this.datasetCatalogue.isEmpty()));
    }

    public void unsetDatasetCatalogue() {
        this.datasetCatalogue = null;
    }

    /**
     * Gets the value of the supportFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MXSupportFilePropertyType }
     * 
     * 
     */
    public List<MXSupportFilePropertyType> getSupportFile() {
        if (supportFile == null) {
            supportFile = new ArrayList<MXSupportFilePropertyType>();
        }
        return this.supportFile;
    }

    public boolean isSetSupportFile() {
        return ((this.supportFile!= null)&&(!this.supportFile.isEmpty()));
    }

    public void unsetSupportFile() {
        this.supportFile = null;
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
            List<MXDataFilePropertyType> theDataFile;
            theDataFile = (this.isSetDataFile()?this.getDataFile():null);
            strategy.appendField(locator, this, "dataFile", buffer, theDataFile);
        }
        {
            List<CTCataloguePropertyType> theDatasetCatalogue;
            theDatasetCatalogue = (this.isSetDatasetCatalogue()?this.getDatasetCatalogue():null);
            strategy.appendField(locator, this, "datasetCatalogue", buffer, theDatasetCatalogue);
        }
        {
            List<MXSupportFilePropertyType> theSupportFile;
            theSupportFile = (this.isSetSupportFile()?this.getSupportFile():null);
            strategy.appendField(locator, this, "supportFile", buffer, theSupportFile);
        }
        return buffer;
    }

    public void setDataFile(List<MXDataFilePropertyType> value) {
        this.dataFile = null;
        List<MXDataFilePropertyType> draftl = this.getDataFile();
        draftl.addAll(value);
    }

    public void setDatasetCatalogue(List<CTCataloguePropertyType> value) {
        this.datasetCatalogue = null;
        List<CTCataloguePropertyType> draftl = this.getDatasetCatalogue();
        draftl.addAll(value);
    }

    public void setSupportFile(List<MXSupportFilePropertyType> value) {
        this.supportFile = null;
        List<MXSupportFilePropertyType> draftl = this.getSupportFile();
        draftl.addAll(value);
    }

}
