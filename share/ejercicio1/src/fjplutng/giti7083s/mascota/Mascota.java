package fjplutng.giti7083s.mascota;

public abstract class Mascota implements Animal{
	/** GENERA EL OBJETO NOMBRE
	 * 
	 */
	private String nombre;
	/**
	 * GENERA EL METODO LAMER
	 * @return 
	 */
	public static void lamer(){
		
	}
	/**
	 * GETTER Y SETTER DEL OBJETO CREADO EN MASCOTA
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
}
