//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.03.07 alle 09:04:14 AM CET 
//


package org.geosdi.geoplatform.xml.filter.v110;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Classe Java per SpatialOperatorsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SpatialOperatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpatialOperator" type="{http://www.opengis.net/ogc}SpatialOperatorType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialOperatorsType", propOrder = {
    "spatialOperator"
})
public class SpatialOperatorsType implements ToString2
{

    @XmlElement(name = "SpatialOperator", required = true)
    protected List<SpatialOperatorType> spatialOperator;

    /**
     * Gets the value of the spatialOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpatialOperatorType }
     * 
     * 
     */
    public List<SpatialOperatorType> getSpatialOperator() {
        if (spatialOperator == null) {
            spatialOperator = new ArrayList<SpatialOperatorType>();
        }
        return this.spatialOperator;
    }

    public boolean isSetSpatialOperator() {
        return ((this.spatialOperator!= null)&&(!this.spatialOperator.isEmpty()));
    }

    public void unsetSpatialOperator() {
        this.spatialOperator = null;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE2;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            List<SpatialOperatorType> theSpatialOperator;
            theSpatialOperator = (this.isSetSpatialOperator()?this.getSpatialOperator():null);
            strategy.appendField(locator, this, "spatialOperator", buffer, theSpatialOperator, this.isSetSpatialOperator());
        }
        return buffer;
    }

    public void setSpatialOperator(List<SpatialOperatorType> value) {
        this.spatialOperator = null;
        if (value!= null) {
            List<SpatialOperatorType> draftl = this.getSpatialOperator();
            draftl.addAll(value);
        }
    }

}
