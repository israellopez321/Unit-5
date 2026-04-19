package ejeciciosAnalisis02;

public abstract class CuentaBancaria {

	protected String numeroCuenta;
	protected double saldo;
	protected Titular[] titulares = new Titular[3];

	/**
	 * Constructor en el que se nos pide el numero de cuenta, saldo y una array de titulares
	 * @param numeroCuenta
	 * @param saldo
	 * @param titutares
	 */
	public CuentaBancaria(String numeroCuenta, double saldo, Titular[] titutares) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titulares = titutares;
	}

	//Getters y setters
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Titular[] getTitutares() {
		return titulares;
	}

	public void setTitutares(Titular[] titutares) {
		this.titulares = titutares;
	}
	
	public void ingresar(double cantidad) {
		saldo += cantidad;
		System.out.println("Ingreso realizado.");
	}
	
	public void retirar(double cantidad) {
		if(saldo < cantidad) {	
			System.out.println("No se podido retirar.");
		}else {
			saldo -= cantidad;
			System.out.println("Retirada reaalizada.");
		}
	}
	
	public void añadirTitular(Titular titular) {
	    // 1. Comprobar si ya hay 3 titulares
	    if (titulares.length == 3) {
	        System.out.println("No se pueden añadir más titulares (máximo 3).");
	        return;
	    }

	    // 2. Comprobar si el titular ya existe (por DNI)
	    for (int i = 0; i < titulares.length; i++) {
	        if (titulares[i] != null && titulares[i].getDni().equals(titular.getDni())) {
	            System.out.println("El titular ya está añadido a la cuenta.");
	            return;
	        }
	    }

	    // 3. Insertar en la primera posición libre
	    for (int i = 0; i < titulares.length; i++) {
	        if (titulares[i] == null) {
	            titulares[i] = titular;
	            System.out.println("Titular añadido correctamente.");
	            return;
	        }
	    }
	}
	
	public void borrarTitular(String dni) {
	    int numTitulares = numeroDeTitulares();

	    // 1. No se puede dejar la cuenta sin titulares
	    if (numTitulares == 1) {
	        System.out.println("No se puede borrar el único titular de la cuenta.");
	        return;
	    }

	    // 2. Buscar el titular por DNI
	    for (int i = 0; i < titulares.length; i++) {
	        if (titulares[i] != null && titulares[i].getDni().equals(dni)) {

	            // 3. Borrar (poner a null)
	            titulares[i] = null;

	            // 4. Compactar el array (evitar huecos)
	            for (int j = i; j < titulares.length - 1; j++) {
	                titulares[j] = titulares[j + 1];
	            }
	            titulares[titulares.length - 1] = null;

	            System.out.println("Titular borrado correctamente.");
	            return;
	        }
	    }

	    // 5. Si no se encontró
	    System.out.println("No existe un titular con ese DNI.");
	}

	
	
	public int numeroDeTitulares() {
		return titulares.length;
	}
	

	
	
}
