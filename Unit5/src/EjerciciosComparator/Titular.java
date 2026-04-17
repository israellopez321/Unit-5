package EjerciciosComparator;

public class Titular {

	private String dni;
	
	//
	
	@Override
	public int compareTo(Titular otroTitular) {
		
		return this.dni.compareTo(otroTitular.dni);
	}
}
