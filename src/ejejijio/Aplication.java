package ejejijio;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
	//Creacion objetos---------------
		Scanner leer = new Scanner(System.in);
		Cliente cliente1= new Cliente();
		Tarjeta tarjeta1 = new Tarjeta();
		CuentaBancaria banco1 = new CuentaBancaria();
		Cajero cajero1 = new Cajero();
	//--------------------------------	
		byte opc;
		System.out.println("Ningun usuario registrado en el banco");
		System.out.println("Registre usuario");
		cliente1.Regristrar();
		for(int i=1;i==1;) 
		{
		System.out.println("¿Que desea hecer?");
		System.out.println("Presione 1 para registrar nuevo usuario en banco");
		System.out.println("Presione 2 entrar al cajero");
		System.out.println("Presione 3 para salir del banco");
		opc=leer.nextByte();
		switch(opc) 
		{
		case 1: cliente1.Regristrar(); break;
		case 2: cliente1.IngresarTarjeta();
		;tarjeta1.ValidarTarjeta();
		;System.out.println("Ingrese su clave"); 
		int clave = leer.nextInt(); 
		if(cliente1.buscar(clave)) 
		{cliente1.SeleccionarOperacion(clave);}
		else {break;}
		; break;
		case 3: i=2; break;
		default: System.out.println("opcion no valida");
		}
		}
	
		}
	}


