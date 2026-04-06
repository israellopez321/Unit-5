package ejercicio04;

public class Electrodomestico {



	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	
	/**
	 * Constructor inicial
	 */
	public Electrodomestico() {
		this.color = "BLANCO";
		this.consumoEnergetico = 'F';
		this.precio = 100;
		this.peso = 5;
	}
	
	/**
	 * Constructor precio y peso
	 * @param precio
	 * @param peso
	 */
	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
	}
	
	/**
	 * Constructor general
	 * @param precio
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 */
	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		super();
		this.precio = precio;
		this.color = color.toUpperCase();
		this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		this.peso = peso;
	}

	//Getters and setters
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/**
	 * Metodo para comprobar si el consumo energetico introducido es correcto
	 * @param letra de consumo energetico
	 */
	public void comprobarConsumoEnergetico(char letra) {
		char resultado = 'F';
		char letraMayus = Character.toUpperCase(letra);
		
		if (letraMayus <= 'F' && letraMayus >= 'A') {
			
			resultado = letraMayus;
		}
		
		this.consumoEnergetico = resultado;
	}
	
	/**
	 * Metodo para comprbar si el color introducido es correcto
	 * @param color del electrodomestico
	 */
	public void comprobarColor(String color) {
		
		String resultado = "BLANCO";
		String colorMayus = color.toUpperCase();
		
		switch(colorMayus) {
		
		case "BLANCO":
		case "NEGRO":
		case "ROJO":
		case "AZUL":
		case "GRIS": 
			resultado = colorMayus;
			break;
		}
		
		this.color = resultado;
	}
	
	/**
	 * Metodo para calcular el precio final del electrodomestico
	 */
	public void precioFinal() {
		
		switch (consumoEnergetico) {
		
		case 'A':
			precio += 100;
			break;
		case 'B':
			precio += 80;
			break;
		case 'C':
			precio += 60;
			break;
		case 'D':
			precio += 50;
			break;
		case 'E':
			precio += 30;
			break;
		case 'F':
			precio += 10;
			break;
		}
		
		if (peso >= 0 && peso <= 19) {
			
			precio += 10;
		} else if(peso > 19 && peso <= 49) {
			
			precio += 50;
		} else if(peso > 49 && peso <= 79) {
			
			precio += 80;
		} else if(peso > 79) {
			
			precio += 100;
		}
	}
	

}
