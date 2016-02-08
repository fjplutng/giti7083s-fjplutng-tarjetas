package fjplutng.giti7083s.proyecto;

import java.util.Date;

public class Proyecto {
	/**
	 * GENERA LOS OBJETOS DE LA CLASE
	 */
	private String nombre;
	private String planificacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String estado;
	/**
	 * GENERA LAS RELACIONES CON OTRAS CLASES
	 */
	private Presupuesto presupuesto[];
	private Cliente cliente;
	private Viaje seRealizaEn[];
	
}
