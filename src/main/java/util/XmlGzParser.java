package util;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

public class XmlGzParser {
    public static <T> T parse(String fileName, Class<T> clazz) throws PubmedException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);

            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            spf.setFeature("http://xml.org/sax/features/validation", false);

            XMLReader xmlReader = spf.newSAXParser().getXMLReader();
            InputSource inputSource = new InputSource(new InputStreamReader(new GZIPInputStream(new FileInputStream(fileName))));
            SAXSource source = new SAXSource(xmlReader, inputSource);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            System.out.println(fileName);

            return clazz.cast(jaxbUnmarshaller.unmarshal(source));

        } catch (SAXException | JAXBException | ParserConfigurationException | IOException e) {
            throw new PubmedException(e.getMessage());
        }
    }
}
