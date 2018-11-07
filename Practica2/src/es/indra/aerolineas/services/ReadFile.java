/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author P.era-1
 *
 */
public class ReadFile {
	
	public List<String> retornarVuelos() {
        Path path = Paths.get("/e:/Proyecto/Repositorio/cursojava/practica-curso-java/vuelos.txt");

        List<String> contenido = null;

        try {

            contenido = Files.readAllLines(path);
            for (String linea : contenido) {
				System.out.println(linea);
			}
            return contenido;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return contenido;

    }
	
	
public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}
}
