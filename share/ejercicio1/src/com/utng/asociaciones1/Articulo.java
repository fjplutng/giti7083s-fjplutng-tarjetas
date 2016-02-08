package com.utng.asociaciones1;

public class Articulo {
	private String art_ID;
	private String art_descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadCritica;
	private double art_cantidadMinima;
	
	public Precios precio;
	public Proveedor proveedor;
	public void Articulo(Precios precios, Proveedor proveedor){
		this.precio = precio;
		this.proveedor = proveedor;
	}

}
