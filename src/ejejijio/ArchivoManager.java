package ejejijio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class ArchivoManager 
{
	public static void guardarArrayListEnArchivo(ArrayList <Cliente> Usuarios) {
        String nombreArchivo = "registro.txt";
        String rutaDirectorio = "C:\\Users\\johan\\eclipse-workspace\\cajero\\Sources";

        // Crear la carpeta "sources" si no existe
        Path directorio = Paths.get(rutaDirectorio);
        if (!Files.exists(directorio)) {
            try {
                Files.createDirectories(directorio);
                System.out.println("Carpeta 'sources' creada correctamente.");
            } catch (IOException e) {
                System.err.println("Error al crear la carpeta 'sources': " + e.getMessage());
                return;
            }
        }

        // Escribir en el archivo dentro de la carpeta "sources"
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDirectorio + "/" + nombreArchivo, true))) {
        	 writer.newLine();
             writer.write("---------Nuevos Movimientos Registrados En El Banco---------");
             writer.newLine();
        	
            for (Object objeto : Usuarios) {
                writer.write(objeto.toString());
                writer.newLine();
            }
          
            System.out.println("Objetos guardados correctamente en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar en el archivo: " + e.getMessage());
        }
    }
}
