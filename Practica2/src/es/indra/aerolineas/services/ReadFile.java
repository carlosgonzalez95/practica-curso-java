/**
 * 
 */
package es.indra.aerolineas.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.exceptions.ErrorLecturaDeVuelosException;



/**
 * @author P.era-1
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() throws ErrorLecturaDeVuelosException {
		
		List<String> vueloshoy = new ArrayList<>();
		
	
        Path path = Paths.get("c:/Users/P.era-1/repositorios/practica-curso-java/vuelos.txt");

        try {
        	
        	vueloshoy = Files.readAllLines(path);                 
            
        } catch (IOException e) {
             
        	throw new ErrorLecturaDeVuelosException("Fallo leyendo el archivo", e);
          } finally {
        	//System.out.println("Finalizada lectura");
        
          } 
        return vueloshoy;
       
        }
      

    
public List<String> retornarVuelosPropagandoError() throws IOException {
		
		List<String> contenido = new ArrayList<>();
		
		Path path = Paths.get("e:/Proyectos/Repositorio/CursoJava/practica-curso-java/vuelos.txt");
		contenido = Files.readAllLines(path);
		
		
		return contenido;
	}
	
	
	

	

}
