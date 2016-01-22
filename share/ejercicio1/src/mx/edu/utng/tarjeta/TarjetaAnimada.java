package mx.edu.utng.tarjeta;

public class TarjetaAnimada extends Tarjeta {
	private String codigo;
	private String fondo;
	private String dedicatoria;
	private String imagen;
	private ArchivoDeTarjetas archivoDeTarjetas;
	
	public TarjetaAnimada(ArchivoDeTarjetas archivoDeTarjetas){
		this.archivoDeTarjetas = archivoDeTarjetas;
	}
}
