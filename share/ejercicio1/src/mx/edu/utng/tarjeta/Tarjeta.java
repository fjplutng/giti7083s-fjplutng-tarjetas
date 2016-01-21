package mx.edu.utng.tarjeta;

import java.util.List;

public class Tarjeta {
	private String tipo;
	private String dedicatoria;
	private Remitente remitente;
	private Integer nroDestinatarios;
	private List<Destinatario> destinatarios;
	private TarjetaAnimada tarjetaAnimada;
	
	public Tarjeta(List<Destinatario> destinatarios, Remitente remitente, TarjetaAnimada tarjetaAnimada){
		this.destinatarios = destinatarios;
		this.remitente = remitente;
		this.tarjetaAnimada = tarjetaAnimada;
	}
	public List<Destinatario> destinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(List<Destinatario> destinatarios) {
		this.destinatarios = destinatarios;
	}

	
	public String getTipo() {
		return tipo;
	}
	public String getDedicatoria() {
		return dedicatoria;
	}

	public Integer getNroDestinatarios() {
		return nroDestinatarios;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setDedicatoria(String dedicatoria) {
		this.dedicatoria = dedicatoria;
	}

	public void setNroDestinatarios(Integer nroDestinatarios) {
		this.nroDestinatarios = nroDestinatarios;
	}
}
