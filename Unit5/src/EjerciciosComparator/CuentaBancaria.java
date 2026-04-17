package EjerciciosComparator;

import java.util.Comparator;

public class CuentaBancaria implements Comparable<CuentaBancaria> {

	//Codigo
	
	private String numeroCuenta;
	private double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	@Override
	public int compareTo(CuentaBancaria otraCuenta) {
		
		return this.numeroCuenta.compareTo(otraCuenta.numeroCuenta);
	}
	
	public static final Comparator<CuentaBancaria> POR_SALDO_DESC = 
			Comparator.comparingDouble(CuentaBancaria::getSaldo).reversed();
	
}
