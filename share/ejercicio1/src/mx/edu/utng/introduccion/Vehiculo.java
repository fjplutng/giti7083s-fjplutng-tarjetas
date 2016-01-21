package mx.edu.utng.introduccion;

public class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private int anio;
	/**
	 * metodo que permite arrancar el vehiculo
	 */
	public void arrancar(){
		System.out.println("Arrancando...");
	}
	/**
	 * metodo que permite apagar el vehiculo
	 */
	public void apagar(){
		System.out.println("Apagando...");
	}
	/**
	 * metodo que permite avanzar el vehiculo
	 */
	public void avanzar(){
		System.out.println("Avanzando...");
	}
	/**
	 * metodo que permite frenar el vehiculo
	 */
	public void frenar(){
		System.out.println("Frenando...");
	}
	public void mover(){
		System.out.println("Moviendo...");
	}
}
