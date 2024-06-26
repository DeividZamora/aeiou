package ejejijio;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;



public class ArchivoManager 
{
	public static void guardarArrayListEnArchivo(ArrayList<Cliente> objetos) {
        String nombreArchivo = "registro.txt";
        String rutaDirectorio = "C:\\Users\\johan\\eclipse-workspace\\cajero\\Sources";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDirectorio + "/" + nombreArchivo))) {
            for (Cliente objeto : objetos) {
                writer.write(objeto.toString());
                writer.newLine();
            }
            System.out.println("Usuarios guardados correctamente en el archivo " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar en el archivo: " + e.getMessage());
        }
    }
	 
//Guarda transacciones---------------------------------------------
	
	public static void guardarTransacciones(ArrayList <Cliente> Usuarios) {
        String nombreArchivo = "registrotrans.txt";
        String rutaDirectorio = "C:\\Users\\johan\\eclipse-workspace\\cajero\\Sources";


        // Escribir en el archivo dentro de la carpeta "sources"
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDirectorio + "/" + nombreArchivo, true))) {
        	 writer.newLine();
             writer.write("---------Nuevos Movimientos Registrados En El Banco---------");
             writer.newLine();
             writer.write("id,clave,saldo");
             writer.newLine();
        	
            for (Object cliente : Usuarios) {
                writer.write(cliente.toString());
                writer.newLine();
            }
          
            System.out.println("Movimentos guardados correctamente en el archivo " + nombreArchivo);
        } catch (Exception e) {
            System.err.println("Error al guardar en el archivo: " + e.getMessage());
        }
    }
	 
	  
}
