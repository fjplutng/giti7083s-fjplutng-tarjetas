package com.utng.asociaciones1;

public class Calificacion {
	private double cal_ID;
	private String cal_Descripcion;
	
	private Proveedor proveedor;
	private proveedorCalificado proveedorcalificado;
	
	public void Calificacion(Proveedor proveedor, proveedorCalificado proveedorcalificado){
		this.proveedor = proveedor;
		this.proveedorcalificado = proveedorcalificado;
	}

}
