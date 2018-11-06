package org.geosdi.geoplatform.support.jackson.jts.deserializer.geometry.writer;

import org.geojson.FeatureCollection;
import org.geojson.GeoJsonObject;
import org.geosdi.geoplatform.support.jackson.jts.deserializer.geometry.writer.function.GeoJsonToJTSGeometryFunction;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryCollection;

import java.util.Objects;
import java.util.function.Function;

import static java.lang.Boolean.TRUE;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class JTSFeatureCollectionWriter extends JTSBaseWriter<FeatureCollection, GeometryCollection> {

    static final Function<GeoJsonObject, Geometry> GEOJSON_TO_JTS_GEOMETRY_FUNCTION = new GeoJsonToJTSGeometryFunction();

    /**
     * @return {@link FeatureCollection}
     */
    @Override
    public Class<FeatureCollection> getKey() {
        return FeatureCollection.class;
    }

    /**
     * @param featureCollection
     * @return {@link GeometryCollection}
     * @throws Exception
     */
    @Override
    public GeometryCollection buildJTSGeometry(FeatureCollection featureCollection) throws Exception {
        logger.trace(":::::::::::::::{} is creating JTS GeometryCollection for GeoJson FeatureCollection : {}\n",
                this, featureCollection);
        return GEOMETRY_FACTORY.createGeometryCollection(featureCollection.getFeatures()
                .stream()
                .map(v -> v.getGeometry())
                .filter(Objects::nonNull)
                .map(GEOJSON_TO_JTS_GEOMETRY_FUNCTION)
                .toArray(size -> new Geometry[size]));
    }

    /**
     * <p>
     * Specify if {@link org.geosdi.geoplatform.support.jackson.jts.bridge.implementor.Implementor} is valid or not
     * </p>
     *
     * @return {@link Boolean}
     */
    @Override
    public Boolean isImplementorValid() {
        return TRUE;
    }
}