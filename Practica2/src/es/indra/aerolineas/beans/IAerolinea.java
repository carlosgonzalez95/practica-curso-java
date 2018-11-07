package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;


public interface IAerolinea {

	void consultarVuelos(String origen) throws ErrorLecturaDeVuelosException;

	void consultarVuelos(String origen, String destino);

	void anularVuelos(String... vuelos);

	Vuelo[] getVuelos();

	String getNombre();

}