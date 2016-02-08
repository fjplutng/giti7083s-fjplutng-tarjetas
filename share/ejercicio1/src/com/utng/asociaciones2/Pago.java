package com.utng.asociaciones2;

public class Pago {
	private double subTotal;
	private double propina;
	private double impuestos;
	
	private Orden orden;
		public void calculoTotal(double subTotal, double propina, double impuestos){
	
	}
	public void Pago(Orden orden){
		this.orden = orden;
	}
}
