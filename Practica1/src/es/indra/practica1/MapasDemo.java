package es.indra.practica1;

import java.util.HashMap;
import java.util.Map;

public class MapasDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> estudiantes = new HashMap<>();
		
		estudiantes.put("Perez","Andres");
		estudiantes.put("Perez","Andres");
		estudiantes.put("Perez","Andres");
		
		System.out.println(estudiantes.size());
		
		for (Map.Entry<String, String> elemento: estudiantes.entrySet() ) {
			System.out.println("Clave: " + elemento.getKey () + "y valor: " + elemento.getValue());
		}
		
	}
	


}
