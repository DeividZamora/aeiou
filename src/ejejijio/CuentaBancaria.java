package ejejijio;

public class CuentaBancaria 

{
	protected String numeroCuenta;
	protected double saldo;
	
	
	public void ConsultarSaldo() 
	{
		System.out.println("Su saldo es de "+saldo);
		
	}
	public double Retirar(double monto)
	{
		saldo=saldo-monto;
		return saldo;
	}
	public double Depositar(double monto) 
	{
		saldo= saldo+monto;
		return saldo;
		
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
