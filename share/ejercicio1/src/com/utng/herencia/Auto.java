package com.utng.herencia;
/**
 * HEREDA LA CLASE VEHICULO
 * @author nueve
 *
 */
public class Auto extends Vehiculo {
	/**
	 * GENERA SUS OBJETOS
	 */
	private boolean descapotable;
	/**
	 * HEREDA LOS OBJETOS DE LA SUPERCLASE
	 * @param duenio
	 * @param puertas
	 * @param ruedas
	 */
	public Auto(String duenio, int puertas, int ruedas) {
		super(duenio, puertas, ruedas);
		// TODO Auto-generated constructor stub
	}
	/**
	 * GENERA SUS METODOS
	 */
	
	public static void subir() {
	}
	public static void bajar(){
		
	}
	/** 
	 * HEREDA LOS METODOS DE LA SUPERCLASE
	 */
	public void caracteristicas() {
	}
	/** GENERA LOS METODOS DEL OBJETO DE ESTA CLASE Y DE LOS HEREDADOS
	/**
	 * @return the descapotable
	 */
	public boolean isDescapotable() {
		return descapotable;
	}
	/**
	 * @param descapotable the descapotable to set
	 */
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
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
	
}
