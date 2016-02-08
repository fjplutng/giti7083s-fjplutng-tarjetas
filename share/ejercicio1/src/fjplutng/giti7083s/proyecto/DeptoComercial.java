package fjplutng.giti7083s.proyecto;

public class DeptoComercial {
	/**
	 * GENERA LOS OBJETOS DE ESTA CLASE
	 */
	public String responsable;
	public IConsultarEstado iconsultarEstado;
	/**
	 * GENERA LOS MÉTODOS DE ESTA CLASE
	 */
	public static void asignarViaje(){
		
	}
	public static void asignarLimite(){
		
	}
	public static void validarPresupuesto(){
		
	}
	/**
	 * CREA LA RELACIÓN DE AGREGACIÓN 
	 * @param iConsultarEstado
	 */
	public DeptoComercial(IConsultarEstado iConsultarEstado) {
		this.iconsultarEstado = iConsultarEstado;
	}
}