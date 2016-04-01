package fjplutng.giti7083s.flyweigth;

public class PruebaFiguras{ // ELEMENTO CLIENTE DEL PATRÓN FLYWEIGTH
	private static final String colores[] = { "Rojo", "Verde","Azul","Blanco","Negro"};    // 1
	public static void main(String[] args){				                                   // 2
	       for (int i=0; i<20; ++i){					                                   // 3
	              Circulo circulo = (Circulo)FabricaFiguras.getCirculo(getRandomColor());
	              circulo.setX(getRandomX());
	              circulo.setY(getRandomY());
	              circulo.setRadio(100);
	              circulo.dibujar();
	       }
	}
	private static int getRandomX(){
	       return(int)Math.random()*100;
	}
	private static int getRandomY(){
	       return(int)Math.random()*100;
	}
	private static String getRandomColor(){
	       return colores[(int)(Math.random()*colores.length)];
	}
}
/**
 * 1  Método para asignar colores 		
 * 2  Método principal
 * 3  Crea 20 círculos objeto mediante FabricaFiguras 
 *    con un color del arreglo colores[], coordenada X, coordenada Y, todos al azar, 
 *    un radio de 100 y se dibuja		
 */

