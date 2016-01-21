package mx.edu.utng.tarjeta;

public class TarjetaAnimada {
	private String codigo;
	private Fondo fondo;
	private Dedicatoria dedicatoria;
	private Imagen imagen;
	
	public TarjetaAnimada(Fondo fondo, Imagen imagen){
		this.fondo = fondo;
		this.imagen = imagen;
		this.dedicatoria = new Dedicatoria();
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
