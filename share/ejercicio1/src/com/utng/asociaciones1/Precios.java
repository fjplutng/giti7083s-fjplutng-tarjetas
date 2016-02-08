package com.utng.asociaciones1;

public class Precios {
	private double pre_ID;
	private double pr_ID;
	private String art_ID;
	private float pre_pesos;
	private float pre_dolar;
	private float pre_cotizacionDolar;
	
	public Articulo articulo;
	public Proveedor proveedor;
	
	public void Precios(Articulo articulo, Proveedor proveedor){
		this.articulo = articulo;
		this.proveedor = proveedor;
	}

}
