/**
 * 
 */
package es.indra.aerolineas.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;
import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author josejarizav
 *
 */
public class Venta {

	private static Vuelo[] creaVuelos() {
		Vuelo[] vuelos = new Vuelo[10];
		for (int i = 0; i < vuelos.length; i++) {
			int a = (int) (Math.random() * 10 + 1);
			vuelos[i] = new Vuelo(i, "SD" + a, "MAD", "VLC", i * 10, true);
		}
		return vuelos;
	}
	
	
	
	
	

	/**
	 * @param args
	 * @throws ErrorLecturaDeVuelosException 
	 */
	public static void main(String[] args) throws ErrorLecturaDeVuelosException {
		
    
	
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Introducca su nombre");
		
		String nombre = scanner.nextLine();
		
		System.out.print("Introducca numero aerolinea");
		
		int alinea = scanner.nextInt();

		System.out.print("Introducca precio");
		
		double precio = scanner.nextDouble();
		
		System.out.print("Nombre: " + nombre);
		System.out.print("Edad " +alinea);
		System.out.print("Precio billete " +precio);
		
		
		
		
		
		Vuelo[] vuelos = creaVuelos();

		IAerolinea aa = new Aerolinea(10, "American Airlines", vuelos);
		
		aa.consultarVuelos("MAD");
		
		aa.consultarVuelos("MAD", "LIS");

		aa.anularVuelos();
		aa.anularVuelos("UX22");
		aa.anularVuelos("UX34");

		Empleado emp = new Empleado();
		emp.setNombre("Vendedor1");

		Pasajero p = new Pasajero();

		Vuelo[] vuelosPasajero = { vuelos[0], vuelos[4] };

		p.setId(10);
		p.setNombre("Jose Julian");
		p.setNombre("Ariza Valderrama");
		p.setVuelos(vuelosPasajero);
		
		
		System.out.println("*************************************************************************");
		

		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));

		System.out.println("|\tLE Atiende ".concat(emp.getNombre()));

		System.out.printf("|\tTenemos %s vuelos disponibles%n", aa.getVuelos().length);

		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(), p.getVuelos().length);
		
		
		
		System.out.println("*************************************************************************");

	}

}
