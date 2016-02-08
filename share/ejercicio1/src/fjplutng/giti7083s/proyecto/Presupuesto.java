package fjplutng.giti7083s.proyecto;

import java.util.Date;

public class Presupuesto implements IConsultarEstado {
	/**
	 * CREA LA RELACIÓN CON DEPARTAMENTO COMERCIAL
	 */
	private DeptoComercial valida[];
	private Date fecha;
	private Comercial calcula;
	private Viaje tiene[];
	public Presupuesto(Comercial calcula){
		this.calcula = calcula;
	}
	@Override
	public void consultarEstado() {
		// TODO Auto-generated method stub

	}
	/**
	 * CREA EL GETTER Y EL SETTER DE LA RELACIÓN CON...
	 * @return
	 */

	/**
	 * @return the valida
	 */
	public DeptoComercial[] getValida() {
		return valida;
	}

	/**
	 * @param valida the valida to set
	 */
	public void setValida(DeptoComercial valida[]) {
		this.valida = valida;
	}

}
