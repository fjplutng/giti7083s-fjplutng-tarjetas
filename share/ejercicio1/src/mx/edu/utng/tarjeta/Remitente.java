package mx.edu.utng.tarjeta;

public class Remitente extends Persona{
	private String apodoRemitente;
	private Tarjeta tarjeta;
	
	public Remitente(Tarjeta tarjeta){
		this.tarjeta = tarjeta;
	}
}
