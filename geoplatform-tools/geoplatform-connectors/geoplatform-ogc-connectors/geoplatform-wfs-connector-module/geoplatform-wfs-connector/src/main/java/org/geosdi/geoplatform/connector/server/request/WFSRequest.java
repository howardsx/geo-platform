/**
 * geo-platform
 * Rich webgis framework
 * http://geo-platform.org
 * ====================================================================
 * <p>
 * Copyright (C) 2008-2020 geoSDI Group (CNR IMAA - Potenza - ITALY).
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
package org.geosdi.geoplatform.connector.server.request;

import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.geosdi.geoplatform.connector.jaxb.repository.JAXBContextConnectorRepository;
import org.geosdi.geoplatform.connector.server.GPServerConnector;
import org.geosdi.geoplatform.jaxb.GPBaseJAXBContext;

import javax.annotation.Nonnull;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringWriter;

import static javax.annotation.meta.When.NEVER;
import static org.apache.hc.core5.http.ContentType.APPLICATION_XML;
import static org.geosdi.geoplatform.connector.jaxb.repository.WFSConnectorJAXBContext.WFS_CONTEXT_KEY;

/**
 * @author Vincenzo Monteverde <vincenzo.monteverde@geosdi.org>
 */
public abstract class WFSRequest<T, Request> extends GPPostConnectorRequest<T, Request> {

    static {
        wfsContext = JAXBContextConnectorRepository.getProvider(WFS_CONTEXT_KEY);
    }

    //
    private static final GPBaseJAXBContext wfsContext;

    /**
     * @param server
     */
    protected WFSRequest(@Nonnull(when = NEVER) GPServerConnector server) {
        super(server);
    }

    /**
     * @return {@link HttpEntity}
     * @throws Exception
     */
    @Override
    protected HttpEntity preparePostEntity() throws Exception {
        Marshaller marshaller = this.getMarshaller();
        Object request = this.createRequest();
        StringWriter writer = new StringWriter();
        marshaller.marshal(request, writer);
        return new StringEntity(writer.toString(), APPLICATION_XML);
    }

    /**
     * @return Marshaller
     * @throws Exception
     */
    @Override
    public Marshaller getMarshaller() throws Exception {
        return wfsContext.acquireMarshaller();
    }

    /**
     * @return Unmarshaller
     * @throws Exception
     */
    @Override
    public Unmarshaller getUnmarshaller() throws Exception {
        return wfsContext.acquireUnmarshaller();
    }

    /**
     * Show the XML Object created for the Request to send to Server
     *
     * @return Request as a String
     * @throws Exception
     */
    @Override
    public String showRequestAsString() throws Exception {
        StringWriter writer = new StringWriter();
        wfsContext.acquireMarshaller().marshal(createRequest(), writer);
        return writer.toString();
    }
}
