package com.utng.asociaciones2;

import java.util.List;

public class Cliente {
	private int mesa;
	private int comensales;
	
	private List<Orden> ordenes;
	
	public Cliente() {
		
	}
	public Cliente(int mesa, int comensales){
		this.mesa = mesa;
		this.comensales = comensales;
	}
}
