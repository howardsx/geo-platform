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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Classe Java per ComparisonOperatorsType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ComparisonOperatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="ComparisonOperator" type="{http://www.opengis.net/ogc}ComparisonOperatorType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComparisonOperatorsType", propOrder = {
    "comparisonOperator"
})
public class ComparisonOperatorsType implements ToString2
{

    @XmlElement(name = "ComparisonOperator", required = true)
    @XmlSchemaType(name = "string")
    protected List<ComparisonOperatorType> comparisonOperator;

    /**
     * Gets the value of the comparisonOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comparisonOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComparisonOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComparisonOperatorType }
     * 
     * 
     */
    public List<ComparisonOperatorType> getComparisonOperator() {
        if (comparisonOperator == null) {
            comparisonOperator = new ArrayList<ComparisonOperatorType>();
        }
        return this.comparisonOperator;
    }

    public boolean isSetComparisonOperator() {
        return ((this.comparisonOperator!= null)&&(!this.comparisonOperator.isEmpty()));
    }

    public void unsetComparisonOperator() {
        this.comparisonOperator = null;
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
            List<ComparisonOperatorType> theComparisonOperator;
            theComparisonOperator = (this.isSetComparisonOperator()?this.getComparisonOperator():null);
            strategy.appendField(locator, this, "comparisonOperator", buffer, theComparisonOperator, this.isSetComparisonOperator());
        }
        return buffer;
    }

    public void setComparisonOperator(List<ComparisonOperatorType> value) {
        this.comparisonOperator = null;
        if (value!= null) {
            List<ComparisonOperatorType> draftl = this.getComparisonOperator();
            draftl.addAll(value);
        }
    }

}
