package ejejijio;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
	//Creacion objetos-------------
		Scanner leer = new Scanner(System.in);
		Cliente cliente1= new Cliente();
		Tarjeta tarjeta1 = new Tarjeta();
		CuentaBancaria banco1 = new CuentaBancaria();
		Cajero cajero1 = new Cajero();
	//--------------------------------	
		
		
		
		
		cliente1.IngresarTarjeta();
		cliente1.IngresarClave();
		
		for (int a=1;a==1;)
		{
		
			System.out.println("¿Qué acción desea hacer?");
			System.out.println("1.Consultar saldo.");
			System.out.println("2.Realizar retiro.");
			System.out.println("3.Depositar en cuenta.");
			System.out.println("4. Transferir fondos");
			int opcion = leer.nextInt();
			
			switch(opcion) 
			
			{
			case 1: banco1.ConsultarSaldo(); break;
			case 2: System.out.println("Digite la cantidad de dinero que quiere retirar")
			;banco1.Retirar(leer.nextDouble()); break;
			case 3: System.out.println("Digite la cantidad de dinero que quiere depositar")
			;banco1.Depositar(leer.nextDouble()); break;
			case 4: a=2; break;
			default: System.out.println("Valor inválido");
			}
		}
	}

}
