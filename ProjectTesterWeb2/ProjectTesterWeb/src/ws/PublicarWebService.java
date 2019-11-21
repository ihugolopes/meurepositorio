package ws;

import javax.xml.ws.Endpoint;

public class PublicarWebService {

	public static void main(String[] args) {
	
		ClienteWS service = new ClienteWS();
		String url = "http://localhost:8080/listacliente";
		
		System.out.println("WebService rodando: " + url);
		
		Endpoint.publish(url, service);
		
	}

}
