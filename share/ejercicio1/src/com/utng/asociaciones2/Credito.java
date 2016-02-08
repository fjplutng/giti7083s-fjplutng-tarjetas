package com.utng.asociaciones2;

public class Credito extends Pago{
	private int numeroTDeCredito;
	private double propina;
	private double impuestos;
	private boolean hacerCargo;
	
	public void hacerCargo(){
		double total = 0;
		if (hacerCargo) {
			total += propina + impuestos;
		}
		
	}
	

}
