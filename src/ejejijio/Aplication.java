package ejejijio;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Cliente cliente1= new Cliente();
		Tarjeta tarjeta1 = new Tarjeta();
		CuentaBancaria banco1 = new CuentaBancaria();
		Cajero cajero1 = new Cajero();
		
		
		
		
		int selec=1;
		cliente1.IngresarTarjeta();
		cliente1.IngresarClave();
		
		do 
		{
			selec=0;
			System.out.println("¿Qué acción desea hacer?");
			System.out.println("1.Consultar saldo. 2.Realizar retiro. 3.Depositar en cuenta. 4. Tramsferir fondos");
			
			int opcion = leer.nextInt();
			
			switch(opcion) 
			
			{
			case 1: banco1.ConsultarSaldo(); break;
			
			default: 
			}
			
		}
		while(selec==1);
	}

}
