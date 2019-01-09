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
package org.geosdi.geoplatform.support.primitive.bridge.finder;

import net.jcip.annotations.ThreadSafe;
import org.geosdi.geoplatform.support.bridge.GPImplementorArraySet;
import org.geosdi.geoplatform.support.bridge.finder.GPBaseImplementorFinder;
import org.geosdi.geoplatform.support.bridge.implementor.GPImplementor;
import org.geosdi.geoplatform.support.primitive.bridge.implementor.PrimitiveImplementor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;
import java.util.Set;

import static java.lang.Thread.currentThread;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
@ThreadSafe
public final class GPPrimitiveImplementorFinder<I extends PrimitiveImplementor<?>> extends GPBaseImplementorFinder<I> {

    private static final Logger logger = LoggerFactory.getLogger(GPPrimitiveImplementorFinder.class);
    //
    private volatile ServiceLoader<PrimitiveImplementor> loader = ServiceLoader.load(PrimitiveImplementor.class,
            currentThread().getContextClassLoader());

    /**
     * @return {@link Set<PrimitiveImplementor>}
     */
    @Override
    public Set<I> getAllImplementors() {
        return loadImplementors(null, Boolean.TRUE);
    }

    /**
     * @return {@link Set<org.geosdi.geoplatform.support.primitive.bridge.implementor.GPPrimitiveImplementor>}
     */
    @Override
    public Set<I> getValidImplementors() {
        return loadImplementors(PrimitiveImplementor.class, Boolean.FALSE);
    }

    @Override
    public void reload() {
        this.loader.reload();
        logger.trace("#################################CALLED RELOAD on : {}\n", loader.toString());
    }

    /**
     * @param type
     * @param all
     * @return {@link Set<I>}
     */
    @Override
    protected <V extends GPImplementor> Set<I> loadImplementors(Class<V> type, Boolean all) {
        Iterator<PrimitiveImplementor> primitiveImplementors = loader.iterator();

        return new GPImplementorArraySet<>(new Iterator<I>() {

            private I next;

            @Override
            public boolean hasNext() {
                if (next != null) {
                    return Boolean.TRUE;
                }

                while (primitiveImplementors.hasNext()) {
                    PrimitiveImplementor primitiveImplementor = primitiveImplementors.next();
                    if ((type == null) || (type.isInstance(primitiveImplementor))) {
                        if (all || primitiveImplementor.isValid()) {
                            next = (I) primitiveImplementor;
                            return Boolean.TRUE;
                        }
                    }
                }
                return Boolean.FALSE;
            }

            @Override
            public I next() {
                if (hasNext()) {
                    I p = next;
                    next = null;
                    return p;
                }
                throw new NoSuchElementException("No more elements");
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove elements "
                        + "from this Iterator");
            }

        });
    }
}
