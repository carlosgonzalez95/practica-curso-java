/**
 * 
 */
package es.indra.aerolineas.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;

/**
 * @author P.era-1
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() throws ErrorLecturaDeVuelosException {
		
        Path path = Paths.get("C:/Repositorios/practica-curso-java/vuelos.txt");

        List<String> contenido = null;

        try {
            contenido = Files.readAllLines(path);
            
            
            
        } catch (IOException e) {
            throw new ErrorLecturaDeVuelosException("Fallo leyendo el archivo", e);
          } finally {
        	System.out.println("Leyendo");
          } 
        return contenido;
       
        }
      

    
	
	
	
	

	

}
