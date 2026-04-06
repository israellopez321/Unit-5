package ejercicio04;

class Lavadora extends Electrodomestico {
	
	 private static final double CARGA_DEF = 5;
	
	private double carga;

	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA_DEF;
	}
	
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

	public void precioFinal() {
		super.precioFinal();
		
		if(carga > 30) {	
			precio += 50;
		}
	}
	
	
}
