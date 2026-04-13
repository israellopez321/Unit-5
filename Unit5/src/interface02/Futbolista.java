package interface02;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista> {

	
	private int numCamiseta;
	private String nombre;
	private int edad;
	private int numGoles;
	
	/**
	 * Constructor general
	 * @param numCamiseta
	 * @param nombre
	 * @param edad
	 * @param numGoles
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		super();
		this.numCamiseta = numCamiseta;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}
	
	//Getters and setters
	public int getNumCamiseta() {
		return numCamiseta;
	}
	public void setNumCamiseta(int numCamiseta) {
		this.numCamiseta = numCamiseta;
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
	public int getNumGoles() {
		return numGoles;
	}
	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		return numCamiseta == other.numCamiseta &&
	               Objects.equals(nombre, other.nombre);
	    }

	@Override
	public String toString() {
		return "Futbolista [numCamiseta=" + numCamiseta + ", nombre=" + nombre + ", edad=" + edad + ", numGoles="
				+ numGoles + "]";
	}
	
	@Override
	public int compareTo(Futbolista persona) {
		
		int res = 0;
        
        if(this.numCamiseta < persona.numCamiseta) {
            res = -1;
        }else if(this.numCamiseta > persona.numCamiseta) {
            res = 1;
        }else {
        	res = this.nombre.compareTo(persona.nombre);
        }
        
        return res;
    }
	
	
	
	

}
