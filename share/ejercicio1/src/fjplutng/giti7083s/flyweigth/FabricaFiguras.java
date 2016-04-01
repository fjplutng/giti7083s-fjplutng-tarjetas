package fjplutng.giti7083s.flyweigth;

import java.util.HashMap;							// ELEMENTO FÁBRICA DEL PATRÓN FLYWEIGTH
public class FabricaFiguras{
	private static final HashMap<String, IFigura>   // 1
	MapaCirculo = new HashMap<String, IFigura>();
	public static IFigura getCirculo(String color){
		Circulo circulo = (Circulo)MapaCirculo.get(color);   //  2
		if (circulo == null){				 				 //  3
			circulo = new Circulo(color);                    //  4
			MapaCirculo.put(color, circulo);                 //  5
			System.out.println("Creando círculo de color : " + color);
		}
	return circulo;					                         //  6
	}
}
/**
*Si no existe el objeto requerido lo crea y lo retorna; si ya existe simplemente lo retorna.
*Cuando lo crea lo almacena en MapaCirculo, creado con el HashMap, 
*almacén al que no se puede acceder de ningún otro lado que no sea la fábrica de objetos flyweigth
*1  Se crea el almacén de círculos
*2  Se crea un objeto circulo de tipo Circulo buscándolo en el almacén de círculos (MapaCirculo) mediante su color.
*3  Si no existe en el almacén                                	
*4  Lo crea
*5  Y lo guarda en el almacén
*6  Regresa el círculo
*/
