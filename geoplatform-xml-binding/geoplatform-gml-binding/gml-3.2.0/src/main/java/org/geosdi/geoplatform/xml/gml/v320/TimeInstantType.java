//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2015.06.18 alle 12:52:42 AM CEST 
//


package org.geosdi.geoplatform.xml.gml.v320;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom;
import org.jvnet.jaxb2_commons.lang.MergeStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Classe Java per TimeInstantType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="TimeInstantType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractTimeGeometricPrimitiveType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}timePosition"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInstantType", propOrder = {
    "timePosition"
})
public class TimeInstantType
    extends AbstractTimeGeometricPrimitiveType
    implements Cloneable, CopyTo, Equals, HashCode, MergeFrom, ToString
{

    @XmlElement(required = true)
    protected TimePositionType timePosition;

    /**
     * Recupera il valore della proprietà timePosition.
     * 
     * @return
     *     possible object is
     *     {@link TimePositionType }
     *     
     */
    public TimePositionType getTimePosition() {
        return timePosition;
    }

    /**
     * Imposta il valore della proprietà timePosition.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePositionType }
     *     
     */
    public void setTimePosition(TimePositionType value) {
        this.timePosition = value;
    }

    public boolean isSetTimePosition() {
        return (this.timePosition!= null);
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
            TimePositionType theTimePosition;
            theTimePosition = this.getTimePosition();
            strategy.appendField(locator, this, "timePosition", buffer, theTimePosition);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeInstantType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TimeInstantType that = ((TimeInstantType) object);
        {
            TimePositionType lhsTimePosition;
            lhsTimePosition = this.getTimePosition();
            TimePositionType rhsTimePosition;
            rhsTimePosition = that.getTimePosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timePosition", lhsTimePosition), LocatorUtils.property(thatLocator, "timePosition", rhsTimePosition), lhsTimePosition, rhsTimePosition)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            TimePositionType theTimePosition;
            theTimePosition = this.getTimePosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timePosition", theTimePosition), currentHashCode, theTimePosition);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof TimeInstantType) {
            final TimeInstantType copy = ((TimeInstantType) draftCopy);
            if (this.isSetTimePosition()) {
                TimePositionType sourceTimePosition;
                sourceTimePosition = this.getTimePosition();
                TimePositionType copyTimePosition = ((TimePositionType) strategy.copy(LocatorUtils.property(locator, "timePosition", sourceTimePosition), sourceTimePosition));
                copy.setTimePosition(copyTimePosition);
            } else {
                copy.timePosition = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TimeInstantType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TimeInstantType) {
            final TimeInstantType target = this;
            final TimeInstantType leftObject = ((TimeInstantType) left);
            final TimeInstantType rightObject = ((TimeInstantType) right);
            {
                TimePositionType lhsTimePosition;
                lhsTimePosition = leftObject.getTimePosition();
                TimePositionType rhsTimePosition;
                rhsTimePosition = rightObject.getTimePosition();
                target.setTimePosition(((TimePositionType) strategy.merge(LocatorUtils.property(leftLocator, "timePosition", lhsTimePosition), LocatorUtils.property(rightLocator, "timePosition", rhsTimePosition), lhsTimePosition, rhsTimePosition)));
            }
        }
    }

    public TimeInstantType withTimePosition(TimePositionType value) {
        setTimePosition(value);
        return this;
    }

    @Override
    public TimeInstantType withFrame(String value) {
        setFrame(value);
        return this;
    }

    @Override
    public TimeInstantType withRelatedTime(RelatedTimeType... values) {
        if (values!= null) {
            for (RelatedTimeType value: values) {
                getRelatedTime().add(value);
            }
        }
        return this;
    }

    @Override
    public TimeInstantType withRelatedTime(Collection<RelatedTimeType> values) {
        if (values!= null) {
            getRelatedTime().addAll(values);
        }
        return this;
    }

    @Override
    public TimeInstantType withRelatedTime(List<RelatedTimeType> value) {
        setRelatedTime(value);
        return this;
    }

    @Override
    public TimeInstantType withMetaDataProperty(MetaDataPropertyType... values) {
        if (values!= null) {
            for (MetaDataPropertyType value: values) {
                getMetaDataProperty().add(value);
            }
        }
        return this;
    }

    @Override
    public TimeInstantType withMetaDataProperty(Collection<MetaDataPropertyType> values) {
        if (values!= null) {
            getMetaDataProperty().addAll(values);
        }
        return this;
    }

    @Override
    public TimeInstantType withDescription(StringOrRefType value) {
        setDescription(value);
        return this;
    }

    @Override
    public TimeInstantType withDescriptionReference(ReferenceType value) {
        setDescriptionReference(value);
        return this;
    }

    @Override
    public TimeInstantType withIdentifier(CodeWithAuthorityType value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public TimeInstantType withName(CodeType... values) {
        if (values!= null) {
            for (CodeType value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    @Override
    public TimeInstantType withName(Collection<CodeType> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    @Override
    public TimeInstantType withId(String value) {
        setId(value);
        return this;
    }

    @Override
    public TimeInstantType withMetaDataProperty(List<MetaDataPropertyType> value) {
        setMetaDataProperty(value);
        return this;
    }

    @Override
    public TimeInstantType withName(List<CodeType> value) {
        setName(value);
        return this;
    }

}