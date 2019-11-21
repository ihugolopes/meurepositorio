package controll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		// HashMap
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(10, "Luciana");
		mapa.put(20, "Hugo");
		mapa.put(30, "Ronan");
		
		System.out.println(mapa.get(20));
		System.out.println("------------------------------------");
		
		for (Map.Entry<Integer, String> resp : mapa.entrySet()) {
			System.out.println("Key: " + resp.getKey() + ", = " + resp.getValue());
		}
		
		System.out.println("------------------------------------");
		
		// List/ArrayList
		List<String> lista = new ArrayList<String>();
		lista.add("Hugo");
		lista.add("Jander");
		lista.add("Giovanni");
		
		System.out.println(lista.get(0));
	}

}
