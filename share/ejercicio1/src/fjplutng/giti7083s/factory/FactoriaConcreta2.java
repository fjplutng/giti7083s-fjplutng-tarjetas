package fjplutng.giti7083s.factory;
/**
 * HEREDA LOS METODOS DE LA CLASE ABSTRACTA QUE SE IMPLEMENTA
 * @author nueve
 *
 */
public class FactoriaConcreta2 implements AbstactFactory{
	/**
	 * RELACIONA LAS INTERFASES NECESARIAS
	 */
	private ProductoA2 productoA2;
	private ProductoB2 productoB2;
	
	/**
	 * CREA RELACIÓN DE AGRAGACIÓN CON LAS INTERFASES RELACIONADAS
	 * @param abstactFactory
	 */
	public FactoriaConcreta2(ProductoA2 productoA2, ProductoB2 productoB2){
		this.productoA2 = productoA2;
		this.productoB2 = productoB2;
	}
	/**
	 * GETTERS Y SETTERS DE LOS OBJETOS CREADOS
	 * @param productoA2
	 */
	public void setProductoA2(ProductoA2 productoA2) {
		this.productoA2 = productoA2;
	}
	public void setProductoB2(ProductoB2 productoB2) {
		this.productoB2 = productoB2;
	}
	public ProductoA2 getProductoA2() {
		return productoA2;
	}
	public ProductoB2 getProductoB2() {
		return productoB2;
	}
}
