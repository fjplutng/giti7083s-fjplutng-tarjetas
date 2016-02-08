package fjplutng.giti7083s.factory;
/**
 * HEREDA LOS METODOS DE LA CLASE ABSTRACTA QUE SE IMPLEMENTA
 * @author nueve
 *
 */

public class FactoriaConcreta1 implements AbstactFactory{
	/**
	 * RELACIONA LAS INTERFASES NECESARIAS
	 */
	private ProductoA1 productoA1;
	private ProductoB1 productoB1;
	
	/**
	 * CREA RELACIÓN DE AGRAGACIÓN CON LAS INTERFASES RELACIONADAS
	 * @param abstactFactory
	 */
	public FactoriaConcreta1(AbstactFactory abstactFactory, ProductoA1 productoA1, ProductoB1 productoB1){
		this.productoA1 = productoA1;
		this.productoB1 = productoB1;
	}
	/** 
	 * GETTERS Y SETTERS DE LOS OBJETOS CREADOS
	 */
	public void setProductoA1(ProductoA1 productoA1) {
		this.productoA1 = productoA1;
	}
	public void setProductoB1(ProductoB1 productoB1) {
		this.productoB1 = productoB1;
	}
	public ProductoA1 getProductoA1() {
		return productoA1;
	}
	public ProductoB1 getProductoB1() {
		return productoB1;
	}
}