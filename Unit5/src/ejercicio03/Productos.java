package ejercicio03;

public class Productos {

	protected String nombre;
	protected double precio;
	
	//Constructor inicial
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	/**
	 *Funcion para calcular el precio final de la compra de producto
	 * @param cantidad de producto
	 * @return precio final
	 */
	public double calcular(int cantidad) {
		
		return precio * cantidad;
		
	}
	

	
	

}
