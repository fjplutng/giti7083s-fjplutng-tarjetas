package fjplutng.giti7083s.proyecto;

public class Cliente {
	/**
	 * GENERA LA RELACION CON PRESUPUESTO
	 */
	private Presupuesto solicita[];
	private Proyecto proyecto;

	/**
	 * @return the solicita
	 */
	public Presupuesto[] getSolicita() {
		return solicita;
	}

	/**
	 * @param solicita the solicita to set
	 */
	public void setSolicita(Presupuesto solicita[]) {
		this.solicita = solicita;
	}
	
}
