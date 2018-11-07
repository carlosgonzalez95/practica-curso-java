/**
 * 
 */
package es.indra.aerolineas.map;

import es.indra.aerolineas.beans.impl.Billete;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Carlos
 *
 */
public class MapBillete {

	private static String key;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Billete bill1 = new Billete("14-8-2018",18);
		Billete bill2 = new Billete("13-8-2018",25);
		Billete bill3 = new Billete("12-8-2018",18);
		Billete bill4 = new Billete("11-8-2018",18);
	
		Map<Integer, Billete> Billetes = new TreeMap<Integer, Billete>();
		Billetes.put(5, bill1);
		Billetes.put(3, bill2);	
		Billetes.put(11, bill3);	
		Billetes.put(16, bill4);	
		
		
		System.out.println("Fecha:" + key + " Nºbillete: " + Billetes.get(1));
		
	}
	
	

}
