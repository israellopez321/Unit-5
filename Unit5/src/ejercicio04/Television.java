package ejercicio04;

class Television extends Electrodomestico{

	private double resolucion;
	private boolean sintonizadorTDT;
	
	public Television() {
		
		super();
		this.resolucion = 20;
		this.sintonizadorTDT = false;	
	}
	
	public Television(double precio, double peso) {
		
		super(precio,peso);
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	public Television(double resolucion, boolean sintonizador, double precio, String color, char consumoEnergetico, double peso) {
		
		super(precio, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}

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
