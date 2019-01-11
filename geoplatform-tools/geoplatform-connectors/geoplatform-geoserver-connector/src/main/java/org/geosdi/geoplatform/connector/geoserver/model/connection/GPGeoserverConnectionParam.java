/**
 * geo-platform
 * Rich webgis framework
 * http://geo-platform.org
 * ====================================================================
 * <p>
 * Copyright (C) 2008-2019 geoSDI Group (CNR IMAA - Potenza - ITALY).
 * <p>
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version. This program is distributed in the
 * hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details. You should have received a copy of the GNU General
 * Public License along with this program. If not, see http://www.gnu.org/licenses/
 * <p>
 * ====================================================================
 * <p>
 * Linking this library statically or dynamically with other modules is
 * making a combined work based on this library. Thus, the terms and
 * conditions of the GNU General Public License cover the whole combination.
 * <p>
 * As a special exception, the copyright holders of this library give you permission
 * to link this library with independent modules to produce an executable, regardless
 * of the license terms of these independent modules, and to copy and distribute
 * the resulting executable under terms of your choice, provided that you also meet,
 * for each linked independent module, the terms and conditions of the license of
 * that module. An independent module is a module which is not derived from or
 * based on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obligated to do so. If you do not
 * wish to do so, delete this exception statement from your version.
 */
package org.geosdi.geoplatform.connector.geoserver.model.connection;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import static javax.xml.bind.annotation.XmlAccessType.PROPERTY;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlAccessorType(PROPERTY)
public class GPGeoserverConnectionParam implements IGPGeoserverConnectionParam {

    private static final long serialVersionUID = 7701839272292492501L;
    //
    private String key;
    private String value;

//    /**
//     * @param theKey
//     * @param theValue
//     */
//    @JsonCreator
//    public GPGeoserverConnectionParam(@Nonnull(when = When.NEVER) @JsonProperty(value = "@key") String theKey,
//            @Nonnull(when = When.NEVER) @JsonProperty(value = "$") String theValue) {
//        checkArgument((theKey != null) && !(theKey.trim().isEmpty()), "The Parameter key must not be null or an empty String.");
//        checkArgument((theValue != null) && !(theValue.trim().isEmpty()), "The Parameter value must not be null or an empty String.");
//        this.key = theKey;
//        this.value = theValue;
//    }


    /**
     * @return {@link String}
     */
    @XmlElement(name = "@key")
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * @return {@link String}
     */
    @XmlElement(name = "$")
    @Override
    public String getValue() {
        return this.value;
    }
}