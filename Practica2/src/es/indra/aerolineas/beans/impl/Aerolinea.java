/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.List;

//import es.indra.aerolineas.beans.ReadjFile;
import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;
import es.indra.aerolineas.services.ReadFile;


public class Aerolinea extends Vuelo implements IAerolinea {
	
	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];
	
	
	public Aerolinea(String origen) {
		this.getOrigen();				
		
	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the vuelos
	 */
	@Override
	public Vuelo[] getVuelos() {
		return vuelos;
	}

	/**
	 * @param vuelos the vuelos to set
	 */
	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}

	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.impl.IAerolinea#consultarVuelos(java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen) throws ErrorLecturaDeVuelosException {
		System.out.println("**********************************");
		System.out.println("**********************************");
	
		 ReadFile r = new ReadFile();
	        List<String> lista = r.retornarVuelos();
	        
	        if (lista != null && ! lista.isEmpty()) {
	        	for (String vuelos : lista) {
	         System.out.println("VUELOS DE HOY:"+ vuelos);
				}
				
			} else {

			}
	        System.out.printf("| HOY NO HAY VUELOS |");
	}
	
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.impl.IAerolinea#consultarVuelos(java.lang.String, java.lang.String)
	 */
	@Override
	public void consultarVuelos(String origen, String destino) {
		System.out.printf("| Origen y destino de vuelo: %s y %s %n", origen, destino);	
	     
	        
	}
	
	/* (non-Javadoc)
	 * @see es.indra.aerolineas.beans.impl.IAerolinea#anularVuelos(java.lang.String)
	 */
	@Override
	public void anularVuelos(String... vuelos ) {
		System.out.println("| Numero de vuelos a anular: "+ vuelos.length);
	
	}

}
