package cuentas;
// TODO: Auto-generated Javadoc

/**
 * The Class CCuenta.
 */
public class CCuenta {


    /** The nombre. */
    private String nombre;
    
    /** The cuenta. */
    private String cuenta;
    
    /** The saldo. */
    private double saldo;
    
    /** The tipo interés. */
    private double tipoInterés;

    /**
     * Instantiates a new c cuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Instantiates a new c cuenta.
     *
     * @param nom the nom
     * @param cue the cue
     * @param sal the sal
     * @param tipo the tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Estado.
     *
     * @return the double
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresar.
     *
     * @param cantidad the cantidad
     * @throws Exception the exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retirar.
     *
     * @param cantidad the cantidad
     * @throws Exception the exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the cuenta.
	 *
	 * @return the cuenta
	 */
	String getCuenta() {
		return cuenta;
	}

	/**
	 * Sets the cuenta.
	 *
	 * @param cuenta the new cuenta
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Gets the saldo.
	 *
	 * @return the saldo
	 */
	double getSaldo() {
		return saldo;
	}

	/**
	 * Sets the saldo.
	 *
	 * @param saldo the new saldo
	 */
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Gets the tipo interés.
	 *
	 * @return the tipo interés
	 */
	double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Sets the tipo interés.
	 *
	 * @param tipoInterés the new tipo interés
	 */
	void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
