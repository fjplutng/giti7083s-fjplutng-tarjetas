package fjplutng.giti7083s.flyweigth;

public class Circulo implements IFigura{ // ELEMENTO CONCRETO DEL PATRÓN FLYWEIGTH
		private String color;
		private int x;
		private int y;
		private int radio;
		public Circulo(String color){         // CONTRUCTOR
			this.color = color;
		}
		public void setX(int x){             //SETTER
			this.x = x;
		}
		public void setY(int y){             //SETTER
			this.y = y;
		}
		public void setRadio(int radio){      //SETTER
			this.radio = radio;
		}
		
		@Override                             // SOBREESCRIBE EL MÉTODO ABSTRACTO
		public void dibujar(){                // DE LA INTERFAZ IFigura
			System.out.println("Circulo: Dibujar() [Color : " + color + ", x: " + x + ", Y: = " + y + ", Radio : " + radio);
		}
}