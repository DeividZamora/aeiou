package ejejijio;
import java.util.ArrayList;
import java.util.Scanner;
public class Cliente extends CuentaBancaria {
	
	protected int id, clave;
	public Cliente(String numeroCuenta, double saldo, int id, int clave) {
		super(numeroCuenta, saldo);
		this.id = id;
		this.clave=clave;
	}
	
	public Cliente()
	{}
	
	
	
	Scanner leer = new Scanner(System.in);
	
	ArrayList <Cliente> Usuarios = new ArrayList<Cliente>();

	
	public void Regristrar()
	{
		Scanner leer = new Scanner(System.in);
		 
		Cliente objper = new Cliente();
	    
	    // Verificar si la identificación ya existe en la lista
	    boolean existe = false;
	    for (Cliente persona : Usuarios) {
	        if (persona.getId()==id) {
	            System.out.println("La identificación ya existe.");
	            existe = true;
	            break;
	        }
	    }

	    if (!existe) {
	        objper.setId(id);

	        System.out.print("Ingrese su clave: ");
	        objper.setClave(leer.nextInt());

	        Usuarios.add(objper);
	        System.out.println("Persona agregada correctamente.");
	    }
	}
	
	public void IngresarTarjeta() 
	{
		System.out.println("Ingrese su clave");	
		
	
	}
	public void IngresarClave() 
	{	
	clave= leer.nextInt();
	}
	
	
	public void SeleccionarOperacion() {}
	
	
	//Getters y setters---------	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public Scanner getLeer() {
		return leer;
	}

	public void setLeer(Scanner leer) {
		this.leer = leer;
	}


	}
	
	
	

