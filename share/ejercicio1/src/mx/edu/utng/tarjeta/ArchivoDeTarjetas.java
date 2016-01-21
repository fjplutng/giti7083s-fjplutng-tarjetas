package mx.edu.utng.tarjeta;

public class ArchivoDeTarjetas {
	private String nombre;
	private TarjetaAnimada tarjetaAnimada;
	
	public ArchivoDeTarjetas(TarjetaAnimada tarjetaAnimada){
		this.tarjetaAnimada = tarjetaAnimada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
