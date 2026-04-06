package ejercicio04;

/**
 * Clase Television que llama a su superclase Electromestico
 */
class Television extends Electrodomestico{

	static final double RESOLUCION_DEF = 20;
	static final boolean SINTONIZADOR_DEF = false;
	
	private double resolucion;
	private boolean sintonizadorTDT;
	
	/**
	 * Constructor inicial
	 */
	public Television() {
		
		super();
		this.resolucion = RESOLUCION_DEF;
		this.sintonizadorTDT = SINTONIZADOR_DEF;	
	}
	
	/**
	 * Constructor para precio y peso
	 * @param precio
	 * @param peso
	 */
	public Television(double precio, double peso) {
		
		super(precio,peso);
		this.resolucion = RESOLUCION_DEF;
		this.sintonizadorTDT = SINTONIZADOR_DEF;
	}
	
	/**
	 * Contructor general
	 * @param resolucion
	 * @param sintonizador
	 * @param precio
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Television(double resolucion, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
		
		super(precio, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}

	// Getters and setters
	
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	/**
	 * Metodo para calcular el precio final llamando a la superclase
	 */
	public void precioFinal() {

		if(resolucion > 40) {
			
			precio += precio * 0.30;
		}
		
		if(sintonizadorTDT == true) {
			
			precio += 50;
		}
		
		super.precioFinal();
	}
	

}
