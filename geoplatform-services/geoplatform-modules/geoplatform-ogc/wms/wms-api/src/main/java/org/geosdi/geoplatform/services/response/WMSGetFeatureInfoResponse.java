package org.geosdi.geoplatform.services.response;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Nonnull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

import static javax.annotation.meta.When.NEVER;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@Getter
@NoArgsConstructor
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
public class WMSGetFeatureInfoResponse implements GPWMSGetFeatureInfoResponse {

    private static final long serialVersionUID = 8513460200609874662L;
    //
    private List<Object> features = Lists.newArrayList();

    /**
     * @param theFeature
     */
    @Override
    public void addFeature(@Nonnull(when = NEVER) Object theFeature) {
        if (theFeature != null)
            this.features.add(theFeature);
    }
}