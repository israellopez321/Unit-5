package ejercicio02;

class Operario extends Empleado {

	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return  super.toString() + " -> Operario";
	}

	
	

}
