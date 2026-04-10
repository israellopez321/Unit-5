package interface01;

public class Socio implements Comparable{

	
	private int id;
	private String nombre;
	private int edad;
	
	/**
	 * Constructor general
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Socio(int id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public int compareTo(Socio socio) {
		int res = 0;
		
		if(this.id < socio.id) {
			res = -1;
		}else if(this.id > socio.id) {
			res = 1;
		}
		return res;
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
