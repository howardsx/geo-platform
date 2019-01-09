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
package org.geosdi.geoplatform.cxf.rs.support.geocoding.services.api;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;
import org.geosdi.geoplatform.cxf.rs.support.geocoding.path.GPCXFGeocodingRestPathConfig;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@CrossOriginResourceSharing(
        allowAllOrigins = true,
        allowCredentials = true,
        maxAge = 1,
        allowHeaders = {
                "authorization", "content-type", "X-HTTP-Method-Override"
        },
        exposeHeaders = {
                "authorization", "content-type", "X-HTTP-Method-Override"
        }
)
@Path(value = GPCXFGeocodingRestPathConfig.GP_CXF_GEOCODING_REST_PATH)
@Consumes(value = {MediaType.APPLICATION_JSON})
@Produces(value = {MediaType.APPLICATION_JSON})
public interface IGPCXFGeocodingRestService {

    /**
     * @param address
     * @param lang
     * @return {@link Response}
     * @throws Exception
     */
    @GET
    @Path(value = GPCXFGeocodingRestPathConfig.SEARCH_ADDRESS_PATH)
    Response searchAddress(@QueryParam(value = "address") String address,
            @DefaultValue(value = "en") @QueryParam(value = "lang") String lang) throws Exception;
}
