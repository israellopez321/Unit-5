package ejercicio03;

class NoPerecedero extends Productos{

	protected String tipo;
	
	//Constructor inicial
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + "]";
	}

	public double calcular(int cantidad) {
		
		return super.calcular(cantidad);
		
	}
	
	

}
