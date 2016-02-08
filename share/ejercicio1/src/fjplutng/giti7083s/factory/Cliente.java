package fjplutng.giti7083s.factory;
/**
 * ESTA CLASE HACE REFERENCIA A TRES INTERFACES
 * @author nueve
 *
 */
public class Cliente {
	/**
	 * RELACIONA LAS INTERFASES NECESARIAS
	 */
	ProductoA productoA;
	ProductoB productoB;
	public AbstactFactory abstactFactory;
	
	/**
	 * CREA RELACIÓN DE AGRAGACIÓN CON LAS INTERFASES RELACIONADAS
	 * @param abstactFactory
	 */
	public Cliente(AbstactFactory abstactFactory, ProductoA productoA, ProductoB productoB){
		this.productoA = productoA;
		this.productoB = productoB;
		this.abstactFactory = abstactFactory;
		
	}
	
}
