package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlUtil {

	public String getValorXml(Document doc, String valor) {

		NodeList nl = doc.getElementsByTagName("*");

		for (int i = 0; i < nl.getLength(); i++) {
			Element element = (Element) nl.item(i);
			if (element.getNodeName() == valor)
				return element.getTextContent();
		}
		return null;

	}

	public Document converterxml(File file) throws IOException, SAXException, ParserConfigurationException {

		BufferedReader reader = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		String line;
		sb.append("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\">");
		sb.append(System.lineSeparator());

		while ((line = reader.readLine()) != null) {
			if (line.contains("<bsp:")) {
				sb.append(line);
				sb.append(System.lineSeparator());
			}
		}
		sb.append("</x:xmpmeta>");

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		dbFactory.setNamespaceAware(false);
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(new InputSource(new StringReader(new String(sb))));

		return doc;

	}
}
