package ejercicio04;

/**
 * Clase Lavadora que llama a su superclase Electromestico
 */
class Lavadora extends Electrodomestico {
	
	 private static final double CARGA_DEF = 5;
	
	private double carga;

	/**
	 * Constructor inicial
	 */
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	
	/**
	 * Constructor para precio y peso
	 * @param precio
	 * @param peso
	 */
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA_DEF;
	}
	
	/**
	 * Constructor general
	 * @param carga
	 * @param precio
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	//Setter and getter
	
	public double getCargar() {
		return carga;
	}

	public void setCargar(double cargar) {
		this.carga = cargar;
	}
	
	/**
	 * Metodo para comprobar el precio final de la lavadora llamando al superclase
	 */
	public void precioFinal() {
		super.precioFinal();
		
		if(carga > 30) {	
			precio += 50;
		}
	}
	
}
