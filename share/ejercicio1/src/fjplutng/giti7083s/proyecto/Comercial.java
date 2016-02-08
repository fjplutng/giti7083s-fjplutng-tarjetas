package fjplutng.giti7083s.proyecto;

public class Comercial {
	private String estado;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String domicilio;
	private String rfc;
	private DeptoComercial pertenece[];
	private IConsultarEstado iconsultarEstado;
	private Presupuesto calcula;
	/**
	 * CREA LA RELACIÓN DE AGREGACIÓN 
	 * @param iConsultarEstado
	 */
	public Comercial(IConsultarEstado iConsultarEstado, Presupuesto calcula) {
		this.iconsultarEstado = iConsultarEstado;
		this.calcula = calcula;
	}
	
}
