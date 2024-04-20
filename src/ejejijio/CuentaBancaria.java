package ejejijio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class CuentaBancaria 

{
	protected String numeroCuenta;
	protected double saldo;
	
	ArrayList <Cliente> Usuarios = new ArrayList<Cliente>();
	
	public CuentaBancaria(String numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		
	}
	
	public CuentaBancaria()
	{
		
		
	}
	
	
	public void Retirar(int clave,double monto) 
	{   Scanner leer = new Scanner(System.in);
	
		for (Cliente cliente : Usuarios) {
		
				if (cliente.getClave()==clave)
				{	
					cliente.setSaldo(cliente.getSaldo()-monto); 
					
					System.out.println("saldo modificdo a: "+cliente.getSaldo());
				}
			}}

	
	//Getters y stters-----------------
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
