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
// Generated on: 2012.04.16 at 04:57:06 PM CEST 
//


package org.geosdi.geoplatform.xml.wrs._1_0.iri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="qid" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="elementSetName" type="{http://www.opengis.net/cat/wrs/1.0/iri}ElementSetType" minOccurs="0"/>
 *         &lt;element name="startPosition" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="maxRecords" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
    "service",
    "request",
    "qid",
    "elementSetName",
    "startPosition",
    "maxRecords"
})
@XmlRootElement(name = "Query")
public class Query
    implements Serializable, ToString
{

    private final static long serialVersionUID = 1100L;
    @XmlElement(required = true)
    protected String service;
    @XmlElement(required = true)
    protected String request;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String qid;
    protected ElementSetType elementSetName;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger startPosition;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxRecords;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequest(String value) {
        this.request = value;
    }

    /**
     * Gets the value of the qid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQid() {
        return qid;
    }

    /**
     * Sets the value of the qid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQid(String value) {
        this.qid = value;
    }

    /**
     * Gets the value of the elementSetName property.
     * 
     * @return
     *     possible object is
     *     {@link ElementSetType }
     *     
     */
    public ElementSetType getElementSetName() {
        return elementSetName;
    }

    /**
     * Sets the value of the elementSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementSetType }
     *     
     */
    public void setElementSetName(ElementSetType value) {
        this.elementSetName = value;
    }

    /**
     * Gets the value of the startPosition property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartPosition() {
        return startPosition;
    }

    /**
     * Sets the value of the startPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartPosition(BigInteger value) {
        this.startPosition = value;
    }

    /**
     * Gets the value of the maxRecords property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRecords() {
        return maxRecords;
    }

    /**
     * Sets the value of the maxRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRecords(BigInteger value) {
        this.maxRecords = value;
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
            String theService;
            theService = this.getService();
            strategy.appendField(locator, this, "service", buffer, theService);
        }
        {
            String theRequest;
            theRequest = this.getRequest();
            strategy.appendField(locator, this, "request", buffer, theRequest);
        }
        {
            String theQid;
            theQid = this.getQid();
            strategy.appendField(locator, this, "qid", buffer, theQid);
        }
        {
            ElementSetType theElementSetName;
            theElementSetName = this.getElementSetName();
            strategy.appendField(locator, this, "elementSetName", buffer, theElementSetName);
        }
        {
            BigInteger theStartPosition;
            theStartPosition = this.getStartPosition();
            strategy.appendField(locator, this, "startPosition", buffer, theStartPosition);
        }
        {
            BigInteger theMaxRecords;
            theMaxRecords = this.getMaxRecords();
            strategy.appendField(locator, this, "maxRecords", buffer, theMaxRecords);
        }
        return buffer;
    }

}
