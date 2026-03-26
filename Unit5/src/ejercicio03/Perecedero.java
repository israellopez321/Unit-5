package ejercicio03;

class Perecedero extends Productos{

	protected int diasACaducar;
	
	//Constructor inicial
	public Perecedero(String nombre, double precio, int diasACaducar) {
		
		super(nombre, precio);		
		this.diasACaducar = diasACaducar;
	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	@Override
	public String toString() {
		return "Perecedero [diasACaducar=" + diasACaducar + "]";
	}

	/**
	 * Funcion para calcular el precio final de la compra de productos, se vera reducido el precio segun los dias de caducación
	 */
	public double calcular(int cantidad) {
		
		double resultado;
		
		if(diasACaducar == 1) {
			
			resultado = super.calcular(cantidad) / 4;
			
		}else if(diasACaducar == 2) {
			
			resultado = super.calcular(cantidad) / 3;
			
		}else if(diasACaducar == 3) {
			
			resultado = super.calcular(cantidad) / 2;
		} else {
			
			resultado = super.calcular(cantidad);
		}
		
		return resultado;
	}
	

}
