package mx.edu.utng.tarjeta;

public class Destinatario extends Persona{
	private String correo;
	private String apodoDestinatario;
	private Tarjeta tarjeta;
	
	public Destinatario(Tarjeta tarjeta){
		this.tarjeta = tarjeta;
	}
	
}
