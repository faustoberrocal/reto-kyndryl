package com.fausto.entity;

/**
 *
 * @author Fausto
 */

public class Suma {
 
	private int sumando01;
	private int sumando02;
	private int resultado;
 
	protected Suma() {
	}
 
	public Suma(int sumando01, int sumando02, int resultado) {
		this.sumando01 = sumando01;
		this.sumando02 = sumando02;
		this.resultado = resultado;
	}

    /**
     * @return the sumando01
     */
    public int getSumando01() {
        return sumando01;
    }

    /**
     * @param sumando01 the sumando01 to set
     */
    public void setSumando01(int sumando01) {
        this.sumando01 = sumando01;
    }

    /**
     * @return the sumando02
     */
    public int getSumando02() {
        return sumando02;
    }

    /**
     * @param sumando02 the sumando02 to set
     */
    public void setSumando02(int sumando02) {
        this.sumando02 = sumando02;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
