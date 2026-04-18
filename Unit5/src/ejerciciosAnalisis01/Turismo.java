package ejerciciosAnalisis01;

public class Turismo extends Vehiculo {

	private int numeroPlazas;
	private tipoUso uso;
	
	enum tipoUso{
		profesional,
		particular
	}
	
	/**
	 * Constructor inicial
	 * @param numeroPlazas
	 * @param uso
	 */
	public Turismo(int numeroPlazas, tipoUso uso) {
		super();
		this.numeroPlazas = numeroPlazas;
		this.uso = uso;
	}
	
	/**
	 * Constructor general
	 * @param estadoMotor
	 * @param marchaActual
	 * @param velocidadInicial
	 * @param numeroPlazas
	 * @param uso
	 */
	public Turismo(boolean estadoMotor, int marchaActual, int velocidadInicial,int numeroPlazas, tipoUso uso) {
		super(estadoMotor, marchaActual, velocidadInicial);
		this.numeroPlazas = numeroPlazas;
		this.uso = uso;
	}
	
	@Override
	public void acelerar(int incremento) {
		velocidadActual += incremento * 1.0;
	}

	@Override
	public void frenar(int decremento) {
		velocidadActual -= decremento * 1.0;
		
		if(velocidadActual < 0) velocidadActual = 0;
	}
	
	
}
