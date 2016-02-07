package fjplutng.giti7083s.canino;

public abstract class Animal {
	/*
	 * GENERA LOS OBJETOS DE LA CLASE
	 */
	private String foto;
	private String tipo_comida;
	private String localizacion;
	private String tamanio;
	public void hacerRuido(){
		/**
		 *  GENERA LOS MÉTODOS DE LA CLASE
		 */
	}
	public void comer(){
		
	}
	public void dormir(){
		
	}
	public void rugir(){
		
	}
	/** 
	 * GETTERS PARA LOS OBJETOS
	 * @return
	 */
	public String getFoto() {
		return foto;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public String getTipo_comida() {
		return tipo_comida;
	}
	public String getTamanio() {
		return tamanio;
	}
	/**
	 * SETTERS PARA LOS OBJETOS
	 * @param foto
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public void setTipo_comida(String tipo_comida) {
		this.tipo_comida = tipo_comida;
	}
	
}
