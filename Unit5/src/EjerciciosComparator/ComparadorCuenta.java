package EjerciciosComparator;

public class ComparadorCuenta implements Comparator<CuentaBancaria> {
	
	public int compare(CuentaBancaria cuenta1, CuentaBancaria cuenta2) {
		
		return compare(cuenta2.getSaldo(),cuenta1.getSaldo());
		
	}


}
