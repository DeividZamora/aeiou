package ejejijio;

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
	
	public void ConsultarSaldo() 
	{
		System.out.println("Su saldo es de "+saldo);
		
	}
	public void Retirar()
	{
		Scanner leer = new Scanner(System.in);

			
	}
	

		
	
		
	
	
	
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
