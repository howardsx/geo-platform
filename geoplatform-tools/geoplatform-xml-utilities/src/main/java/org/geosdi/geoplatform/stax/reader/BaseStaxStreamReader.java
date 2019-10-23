package org.geosdi.geoplatform.stax.reader;

import org.geosdi.geoplatform.stax.reader.builder.GPXmlStreamReaderBuilder;
import org.geosdi.geoplatform.stax.reader.builder.streamchain.InputStreamBuildHandler;
import org.geosdi.geoplatform.stax.reader.builder.streamchain.StreamReaderBuildHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.Source;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URL;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static javax.annotation.meta.When.NEVER;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
abstract class BaseStaxStreamReader implements GeoPlatformStaxReader {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    //
    private ThreadLocal<XMLStreamReader> xmlStreamReader = new ThreadLocal<>();
    private StreamReaderBuildHandler streamBuilder = new InputStreamBuildHandler();
    private ThreadLocal<InputStream> stream = new ThreadLocal<>();
    private final GPXmlStreamReaderBuilder xmlStreamBuilder;

    /**
     * @param theXmlStreamBuilder
     */
    protected BaseStaxStreamReader(@Nonnull(when = NEVER) GPXmlStreamReaderBuilder theXmlStreamBuilder) {
        checkArgument(theXmlStreamBuilder != null, "The Parameter xmlStreamBuilder must not be null.");
        this.xmlStreamBuilder = theXmlStreamBuilder;
    }

    /**
     * <p> Method to Acquire a valid {@link XMLStreamReader} Reader.
     * The possible Objets are :
     *      <ol>
     *          <li>{@link File}</li>
     *          <li>{@link Reader}</li>
     *          <li>{@link InputStream}</li>
     *          <li>{@link URL}</li>
     *          <li>{@link URI}</li>
     *          <li>{@link XMLStreamReader}</li>
     *          <li>{@link Source}</li>
     *          <li>{@link String}</li>
     *      </ol>
     * </p>
     *
     * @param o
     */
    @Override
    public XMLStreamReader acquireReader(@Nonnull(when = NEVER) Object o) throws Exception {
        this.reset();
        checkNotNull(o, "The Object passed to acquire Reader must not be null.");
        this.stream.set(streamBuilder.buildStream(o));
        this.xmlStreamReader.set((this.stream.get() != null) ? xmlStreamBuilder.build(stream.get()) : xmlStreamBuilder.build(o));
        return this.xmlStreamReader.get();
    }

    /**
     * <p>Close the {@link XMLStreamReader} xmlStreamReader and the {@link InputStream} stream.</p>
     *
     * @throws Exception
     */
    @Override
    public void dispose() throws Exception {
        this.reset();
        logger.debug("#########################Called {}#dispose.", this.getClass().getSimpleName());
    }

    /**
     * @param tagName
     * @throws XMLStreamException
     */
    protected void goToEndTag(String tagName) throws Exception {
        int eventType = xmlStreamReader().getEventType();
        while (xmlStreamReader().hasNext()) {
            if (eventType == XMLEvent.END_ELEMENT && tagName.equalsIgnoreCase(xmlStreamReader().getLocalName())) {
                return;
            }
            eventType = xmlStreamReader().next();
        }
        throw new XMLStreamException("Tag Name '" + tagName + "' not found.");
    }

    /**
     * Check if the tag correspond to prefix and localName.
     *
     * @param prefix    the prefix of the tag
     * @param localName the localName of the tag
     * @return {@link Boolean#TRUE} if the tag is prefix:localName
     */
    protected Boolean isTagName(@Nonnull(when = NEVER) String prefix, @Nonnull(when = NEVER) String localName) throws Exception {
        checkArgument((prefix != null), "The Parameter prefix must not be null.");
        checkArgument((localName != null), "The Parameter localName must not be null.");
        return ((prefix.equals(xmlStreamReader().getPrefix()) && localName.equals(xmlStreamReader().getLocalName())) ? TRUE : FALSE);
    }

    /**
     * @param prefix
     * @return {@link Boolean}
     * @throws Exception
     */
    protected Boolean isTagPrefix(@Nonnull(when = NEVER) String prefix) throws Exception {
        checkArgument((prefix != null), "The Parameter prefix must not be null.");
        return prefix.equalsIgnoreCase(xmlStreamReader.get().getPrefix());
    }

    /**
     * Close both {@link XMLStreamReader} xmlStreamReader and {@link InputStream} stream
     * used to build the xmlStreamReader
     *
     * @throws XMLStreamException
     * @throws IOException
     */
    protected void reset() throws XMLStreamException, IOException {
        if ((xmlStreamReader != null) && (xmlStreamReader.get() != null)) {
            xmlStreamReader.get().close();
            this.xmlStreamReader.set(null);
        }
        if ((stream != null) && (stream.get() != null)) {
            stream.get().close();
            this.stream.set(null);
        }
    }

    /**
     * @return {@link XMLStreamReader}
     */
    protected final XMLStreamReader xmlStreamReader() throws Exception {
        checkArgument(this.xmlStreamReader.get() != null, "The XMLStreamReader must not be null");
        return this.xmlStreamReader.get();
    }

    /**
     * @return {@link XMLEventReader}
     * @throws Exception
     */
    protected final XMLEventReader xmlEventReader() throws Exception {
        checkArgument(this.xmlStreamReader.get() != null, "The XMLStreamReader must not be null");
        return xmlStreamBuilder.build(this.xmlStreamReader.get());
    }
}