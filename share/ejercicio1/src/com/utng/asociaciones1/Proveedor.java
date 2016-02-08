package com.utng.asociaciones1;

public class Proveedor {
	private double pr_ID;
	private String pr_RazonSocial;
	private String pr_contacto;
	private String pr_telefono1;
	private short pr_telefono2;
	private String pr_fax;
	private String pr_email1;
	private String pr_email2;
	private String pr_web;
	private int pr_CUIT;

	private Precios precio;
	private Articulo articulo;
	private Calificacion calificacion;

	public void Proveedor(Precios precio, Articulo articulo, Calificacion calificacion){
		this.precio = precio;
		this.articulo = this.articulo;
		this.calificacion = calificacion;
	}
	
	
}
