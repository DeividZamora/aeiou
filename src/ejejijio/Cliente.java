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
	        
	        System.out.print("Ingrese su id: ");
	        objper.setId(leer.nextInt());
	        

	        Usuarios.add(objper);
	        System.out.println("Usuario creado correctamente.");
	        for(int i=0; i < Usuarios.size(); i++)
	    	{
	    		System.out.println(Usuarios.get(i)); 		
	    	}
	    }
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", clave=" + clave + ", Saldo= "+saldo +"]";
		
	}
	public void Depositar(int clave,double monto) 
	{   Scanner leer = new Scanner(System.in);
	
		for (Cliente cliente : Usuarios) {
		cliente.clave=clave;
				if (cliente.getClave()==clave)
				{	
					cliente.setSaldo(cliente.getSaldo()+monto); 
					
					System.out.println("saldo modificdo a: "+cliente.getSaldo());
				}
			}}	

	public void mostrar()
	{for(int i=0; i < Usuarios.size(); i++)
	{
		System.out.println(Usuarios.get(i)); 		
	}}

	public void IngresarTarjeta() 
	{
		System.out.println("Ingrese su clave");	
		
	
	}
	public void IngresarClave() 
	{	
	clave= leer.nextInt();
	}
	
	public void buscar(int clave)
	{
		System.out.println("Introduzca el ID de la persona que busca");
		Scanner leer = new Scanner(System.in);
		clave = leer.nextInt();
	    for (Cliente persona : Usuarios) {
	        if (persona.getClave()==clave) {
	            System.out.println("Persona encontrada:");
	            System.out.println("Identificación: " + persona.getId());
	            System.out.println("Nombre: " + persona.getSaldo());
	          
	            
	            
	            System.out.println("Presione cualquier tecla para continuar");
	        	String a = leer.next();
	        }}
		
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



	}
	
	
	

