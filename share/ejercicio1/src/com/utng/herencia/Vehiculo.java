package com.utng.herencia;
/**
 * SUPERCLASE
 * @author nueve
 *
 */
public class Vehiculo {
	private String duenio;
	private int puertas;
	private int ruedas;
	/**
	 * CONSTRUCTOR
	 */
	public Vehiculo(String duenio, int puertas, int ruedas){
		this.duenio = duenio;
		this.puertas = puertas;
		this.ruedas = ruedas;
	}
	public void caracteristicas(){
		
	}
	/**
	 *  METODOS
	 */
	public String getDuenio() {
		return duenio;
	}
	public int getPuertas() {
		return puertas;
	}
	public int getRuedas() {
		return ruedas;
	}

}
