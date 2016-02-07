package fjplutng.giti7083s.canino;
public class Perro extends Canino {
	/*
	 * HEREDA LOS MÉTODOS EN ANIMAL(non-Javadoc)
	 * @see fjplutng.giti7083s.canino.Animal#dormir()
	 */
	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		super.comer();
	}
	@Override
	public void hacerRuido() {
		// TODO Auto-generated method stub
		super.hacerRuido();
	}
	/**
	 * CREA NUEVOS MÉTODOS SOLO PARA ESTA CLASE
	 */
	public void sacarPaseo(){
		
	}
	public void vacunar(){
		
	}
}
