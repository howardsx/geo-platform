package org.geosdi.geoplatform.services.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.geosdi.geoplatform.connector.wfs.response.QueryDTO;

import javax.xml.bind.annotation.XmlAccessorType;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@XmlAccessorType
public class GPWFSSearchFeaturesRequest extends WFSBaseSearchFeaturesRequest {

    private static final long serialVersionUID = 1016214439970867351L;
    //
    private QueryDTO queryDTO;
}