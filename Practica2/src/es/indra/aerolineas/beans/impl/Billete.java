package es.indra.aerolineas.beans.impl;

public class Billete {
	private int idb;
	public int asiento;
	private String fecha;
	private Pasajero pasajero;
	private String vuelo;
	
	

	public Billete (int idb, int asiento, String fecha, Pasajero pasajero, String vuelo ){
		super();
		this.idb = idb;
		this.asiento = asiento;
		this.fecha = fecha;
		this.pasajero = pasajero;
		
	}
	
	
	
	
	
	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the pasajero
	 */


	/**
	 * @return the vuelo
	 */
	public String getVuelo() {
		return vuelo;
	}

	/**
	 * @return the pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}





	/**
	 * @param pasajero the pasajero to set
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}





	/**
	 * @param vuelo the vuelo to set
	 */
	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}

	public Billete(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public int getIdb() {
		return idb;
	}

	public void setIdb(int idb) {
		this.idb = idb;
	}
	
	public String toString () {
		return "Billete [id=" + idb + ", vuelo=" + vuelo + ", pasajero=" + pasajero + ", asiento=" + asiento + ", fecha=" + fecha + "]";
	}	
	
}
