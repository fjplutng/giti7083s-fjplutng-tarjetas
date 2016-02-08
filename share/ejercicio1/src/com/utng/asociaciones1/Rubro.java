package com.utng.asociaciones1;

public class Rubro extends Proveedor {
	private String rb_descripcion;
	private int rb_ID;
	private Proveedor proveedor;
	private Articulo articulo;
	public void Rubro(Proveedor proveedor, Articulo articulo){
		this.articulo = articulo;
		this.proveedor = proveedor;
	}

}
