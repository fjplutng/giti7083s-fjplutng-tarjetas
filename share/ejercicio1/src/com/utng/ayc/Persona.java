package com.utng.ayc;

public abstract class Persona {
	/** 
	 * CREA SUS OBJETOS
	 */
	private String nombre;
	private Coche coche;
	private Corazon corazon;
	/**
	 * METODOS Y RELACIONES
	 * @param nom
	 * @param c
	 */
	public Persona(String nom, Coche coche, Corazon corazon) {
		this.corazon = new Corazon();
	}
	public Persona(String nom, Coche coche2) {
		// TODO Auto-generated constructor stub
	}
	public static void viaja(){
		
	}
	public static void emociona(){
		
	}
	public static void tranquiliza(){
		
	}
	//METODOS PARA LOS OBJETOS CREADOS AQUI
	public Coche getC() {
		return coche;
	}
	public String getNombre() {
		return nombre;
	}
	public void setC(Coche conductor) {
		this.coche = coche;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
