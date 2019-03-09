//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.03.07 alle 09:04:14 AM CET 
//


package org.geosdi.geoplatform.xml.filter.v110;

import org.geosdi.geoplatform.xml.gml.v311.EnvelopeType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Classe Java per BBOXType complex type.
 *
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 *
 * <pre>
 * &lt;complexType name="BBOXType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/ogc}SpatialOpsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.opengis.net/ogc}PropertyName"/&gt;
 *         &lt;element ref="{http://www.opengis.net/gml}Envelope"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BBOXType", propOrder = {
        "propertyName",
        "envelope"
})
public class BBOXType extends SpatialOpsType implements ToString2 {

    @XmlElement(name = "PropertyName", required = true)
    protected PropertyNameType propertyName;
    @XmlElementRef(name = "Envelope", namespace = "http://www.opengis.net/gml", type = JAXBElement.class)
    protected JAXBElement<EnvelopeType> envelope;

    /**
     * Recupera il valore della proprietà propertyName.
     *
     * @return possible object is
     * {@link PropertyNameType }
     */
    public PropertyNameType getPropertyName() {
        return propertyName;
    }

    /**
     * Imposta il valore della proprietà propertyName.
     *
     * @param value allowed object is
     *              {@link PropertyNameType }
     */
    public void setPropertyName(PropertyNameType value) {
        this.propertyName = value;
    }

    public boolean isSetPropertyName() {
        return (this.propertyName != null);
    }

    /**
     * Recupera il valore della proprietà envelope.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     */
    public JAXBElement<EnvelopeType> getEnvelope() {
        return envelope;
    }

    /**
     * Imposta il valore della proprietà envelope.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link EnvelopeType }{@code >}
     */
    public void setEnvelope(JAXBElement<EnvelopeType> value) {
        this.envelope = value;
    }

    public boolean isSetEnvelope() {
        return (this.envelope != null);
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
        super.appendFields(locator, buffer, strategy);
        {
            PropertyNameType thePropertyName;
            thePropertyName = this.getPropertyName();
            strategy.appendField(locator, this, "propertyName", buffer, thePropertyName, this.isSetPropertyName());
        }
        {
            JAXBElement<EnvelopeType> theEnvelope;
            theEnvelope = this.getEnvelope();
            strategy.appendField(locator, this, "envelope", buffer, theEnvelope, this.isSetEnvelope());
        }
        return buffer;
    }

}
