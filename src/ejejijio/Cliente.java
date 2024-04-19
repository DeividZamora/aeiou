package ejejijio;
import java.util.Scanner;
public class Cliente {

	Scanner leer = new Scanner(System.in);
	
	protected int id;
	
	public void IngresarTarjeta() 
	{
		System.out.println("Ingrese su clave");
		
		
		
		}
	public void IngresarClave() 
	{	
	int clave= leer.nextInt();
	}
	
	
	public void SeleccionarOperacion() {}
	
	//Getters y setters---------	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
