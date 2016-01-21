package mx.edu.utng.introduccion1;
import javax.swing.text.Position;

public class Trabajador extends Persona {
	private String compania;
	private long salario;
	private Position puesto;
	public void getCompania(){
		System.out.println("compañía...");
	}
	public void getSalario(){
		System.out.println("salario...");
	}
	public void getPuesto(){
		System.out.println("puesto...");
	}
}
