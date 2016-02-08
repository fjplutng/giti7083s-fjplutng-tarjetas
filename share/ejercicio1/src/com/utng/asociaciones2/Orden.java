package com.utng.asociaciones2;

import java.util.List;

public class Orden {
	private int hora;
	private String mesero;
	private String ordenes;
	private List<Platillo> platillos;
	private List<Bebida> bebidas;
	private Pago pago;
	public Orden(){
		
	}
	public Orden(int hora, String mesero, String ordenes, Pago pago){
		this.hora = hora;
		this.mesero = mesero;
		this.ordenes = ordenes;
		this.pago = pago;
	}
}
