package com.utng.ayc;

public class Coche {
	/**
	 * CREA RELACIONES CON LAS OTRAS CLASES
	 */
	private Persona conductor;
	private Motor motor;
	/** 
	 * CONSTRUCTOR
	 * @param motor
	 */
	public Coche(Motor motor){
		this.motor = motor;
		
		
	}
	/**
	 * METODOS
	 * @param conductor
	 */
	public void asignaConductor(Persona conductor){
		
	}
	public static void enciende(){
		
	}
	public static void apaga(){
		
	}
	public static void acelera(){
		
	}
	public static void frena(){
		
	}
	/**
	 * @return the estaEncendido
	 */
	public boolean isEstaEncendido() {
		return estaEncendido;
	}
	/**
	 * @param estaEncendido the estaEncendido to set
	 */
	public void setEstaEncendido(boolean estaEncendido) {
		this.estaEncendido = estaEncendido;
	}
	private boolean estaEncendido;
	
}
