package es.indra.aerolineas.beans.impl;

public abstract  class Persona {

	protected String nombre;
	protected String apellido;
	protected String dni;
	protected int id;

	public Persona() {
		super();
	}
	
	public abstract String solicitarInformacion(); 
	
	
	
	
	public String getNombre() {
		return nombre.toUpperCase();
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}