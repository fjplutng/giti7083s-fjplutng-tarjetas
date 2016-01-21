package mx.edu.utng.tarjeta;

public class Persona {
	private String nombres;
	private String apellidos;
	private Remitente remitente;
	private Destinatario destinatario;
	
	public Persona(Destinatario destinatario, Remitente remitente){
		this.destinatario = destinatario;
		this.remitente = remitente;
	}
	public String getNombres() {
		return nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	

}
