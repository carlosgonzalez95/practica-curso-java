/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author P.era-1
 *
 */
public class Empleado extends Persona {
	
	
	
	
	@Override
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre.toUpperCase();
	}

	@Override
	public String solicitarInformacion() {
		return null;
	}


	
	
}
