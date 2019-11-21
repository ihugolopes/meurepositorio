package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.sql.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import entity.Cliente;
import persistence.ClienteDao;
import persistence.FileDao;

public class PdfToJavaConverter {
	
	public String readPDF(FileReader caminho) throws IOException {
		BufferedReader reader = new BufferedReader(caminho);
		StringBuilder sb = new StringBuilder();
		String line;
		sb.append("<x:xmpmeta xmlns:x=\"adobe:ns:meta/\">");
		while ((line = reader.readLine()) != null) {
			
				if (line.contains("<bsp:") || line.contains("<dc:")) {
					sb.append(line);
					sb.append(System.lineSeparator());
					continue;			
			}
		}
		sb.append("</x:xmpmeta>");
		line = reader.readLine();
		
		return sb.toString();
	}

	private static Document convertStringToXMLDocument(String xmlString) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();	//Analisador que produz árvores de objetos DOM a partir de conteúdo XML
		DocumentBuilder builder = null; //API obtém uma instância do DOM Document 
		try {
			builder = factory.newDocumentBuilder(); // Criar DocumentBuilder com configuração padrão
			Document doc = builder.parse(new InputSource(new StringReader(xmlString))); // Analisar o conteúdo para o objeto Document
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getValorXml(Document doc,String valor){	
        NodeList nl = doc.getElementsByTagName("*");
        
        for (int i=0; i<nl.getLength(); i++) {
            Element element = (Element)nl.item(i);
            	if(element.getNodeName()==valor)
            		return element.getTextContent();
        }
		return null;
		
	}
	
	public static void main(String[] args) throws Exception {
		PdfToJavaConverter dd = new PdfToJavaConverter();
		FileDao fd = new FileDao();
    	FileReader f;
    	
    	f = new FileReader("C:\\docebix.PDF");
    	String pdfs = dd.readPDF(f);
    	DataUtil datautil = new DataUtil();
    	XmlUtil util = new XmlUtil();
		// Use o método para converter o conteúdo da sequência XML em objeto de documento XML
		Document doc = convertStringToXMLDocument(pdfs);

		String item = dd.getValorXml(doc, "bsp:item");
    	String nomeSegurado = dd.getValorXml(doc, "bsp:nomeSegurado");
    	String cpfCnpjSegurado = dd.getValorXml(doc, "bsp:cpfCnpjSegurado");
    	String tipoDocumento = dd.getValorXml(doc, "bsp:tipoDocumento");
    	Date dataEmissao = datautil.ConverterData(util.getValorXml(doc, "bsp:dataEmissao"));
    	String sucursal = dd.getValorXml(doc, "bsp:sucursal");
    	String placa = dd.getValorXml(doc, "bsp:placa");
    	String ramo = dd.getValorXml(doc, "bsp:ramo");
    	String companhia = dd.getValorXml(doc, "bsp:companhia");
    	String cpdCorretor = dd.getValorXml(doc, "bsp:cpdCorretor");
    	String chassi = dd.getValorXml(doc, "bsp:chassi");
    	String numeroApolice = dd.getValorXml(doc, "bsp:numeroApolice");
    	String numeroEndosso = dd.getValorXml(doc, "bsp:numeroEndosso");
    	
	

		Cliente c = new Cliente(); 
		
		c.setItem(item);
		c.setNomeSegurado(nomeSegurado);
		c.setCpfCnpjSegurado(cpfCnpjSegurado);
		c.setTipoDocumento(tipoDocumento);
		c.setDataEmissao(dataEmissao);
		c.setSucursal(sucursal);
		c.setPlaca(placa);
		c.setRamo(ramo);
		c.setCompanhia(companhia);
		c.setCpdCorretor(cpdCorretor);
		c.setChassi(chassi);
		c.setNumeroApolice(numeroApolice);
		c.setNumeroEndosso(numeroEndosso);

//    	try {
//    		File arq = new File("C:\\docebix.PDF");
////    		fd.inserirArquivo(arq);
//    		System.out.println("Salvar arquivo: com sucesso!");
//    		} catch (Exception ex) {
//    			System.out.println("Salvar Arquivo: sem sucesso  - Motivo:  " + ex.getMessage());
//    			
//    		}

		ClienteDao dao = new ClienteDao();
		try {
		String r = dao.create(c);
		System.out.println("Salvar cliente: com sucesso! "  + r);
		} catch (Exception ex) {
			System.out.println("Salvar cliente: sem sucesso! - Motivo:  " + ex.getMessage());
			
			
		}
	}

	
}
