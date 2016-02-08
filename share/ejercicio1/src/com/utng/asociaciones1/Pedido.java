package com.utng.asociaciones1;

import java.util.Date;
import java.util.List;

public class Pedido {
	private double pe_ID;
	private Date pe_fechaPedido;
	private Date pe_fechaNecesidad;
	private Date pe_fechaReprogramada;
	private Date pe_fechaEntrega;
	private int pe_estado;
	private List<Articulo> articulo;
	
	public Pedido(List<Articulo> articulo){
		this.articulo = articulo;
	}

}
