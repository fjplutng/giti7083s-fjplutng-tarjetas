package com.utng.herencia;
/**
 * HEREDA LA CLASE
 * @author nueve
 *
 */
public class Camioneta extends Vehiculo{
	/** 
	 * GENERA SUS OBJETOS
	 */
	private float tara;
	private float carga;
	/** 
	 * CREA RELACION HEREDADA
	 * @param duenio
	 * @param puertas
	 * @param ruedas
	 */
	public Camioneta(String duenio, int puertas, int ruedas) {
		super(duenio, puertas, ruedas);
		// TODO Auto-generated constructor stub
	}
	/**
	 * GENERA EL METODO DE ESTA CLASE
	 */
	public static void cargar(){
		
	}
	/**
	 * HEREDA EL METODO DE SU SUPERCLASE
	 */
	public void caracteristicas() {
	}
	
	@Override
	public String getDuenio() {
		// TODO Auto-generated method stub
		return super.getDuenio();
	}
	@Override
	public int getPuertas() {
		// TODO Auto-generated method stub
		return super.getPuertas();
	}
	@Override
	public int getRuedas() {
		// TODO Auto-generated method stub
		return super.getRuedas();
	}
	/** 
	 * GENERA LOS METODOS DE LOS OBJETOS DE ESTA CLASE
	 * @return
	 */
	public float getCarga() {
		return carga;
	}
	public float getTara() {
		return tara;
	}
	
	
}
