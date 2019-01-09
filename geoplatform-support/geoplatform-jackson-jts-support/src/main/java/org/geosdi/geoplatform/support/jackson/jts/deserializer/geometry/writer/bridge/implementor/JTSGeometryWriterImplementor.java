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
package org.geosdi.geoplatform.support.jackson.jts.deserializer.geometry.writer.bridge.implementor;

import org.geojson.GeoJsonObject;
import org.geosdi.geoplatform.support.bridge.implementor.GPImplementor;
import org.locationtech.jts.geom.Geometry;

import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public interface JTSGeometryWriterImplementor<GEOJSON extends GeoJsonObject, JTS extends Geometry> extends GPImplementor<Class<GEOJSON>> {

    /**
     * @param geojson
     * @return {@link JTS}
     * @throws Exception
     */
    JTS buildJTSGeometry(GEOJSON geojson) throws Exception;

    class JTSGeometryWriterImplementorKey implements GPImplementor.GPImplementorKey<Class<?>> {

        private final Class<?> classe;

        /**
         * @param theClasse
         */
        public JTSGeometryWriterImplementorKey(Class<?> theClasse) {
            checkArgument(theClasse != null, "The Parameter theClasse must not be null.");
            this.classe = theClasse;
        }

        /**
         * @return {@link Class<?>}
         */
        @Override
        public Class<?> getImplementorKey() {
            return this.classe;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof JTSGeometryWriterImplementorKey)) return false;
            JTSGeometryWriterImplementorKey that = (JTSGeometryWriterImplementorKey) o;
            return Objects.equals(classe, that.classe);
        }

        @Override
        public int hashCode() {
            return Objects.hash(classe);
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + "{" +
                    "classe = " + classe +
                    '}';
        }

        /**
         * @param theClasse
         * @return {@link JTSGeometryWriterImplementorKey}
         */
        public static JTSGeometryWriterImplementorKey forClass(Class<?> theClasse) {
            return new JTSGeometryWriterImplementorKey(theClasse);
        }
    }
}