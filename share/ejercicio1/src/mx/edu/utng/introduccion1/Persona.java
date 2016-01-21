package mx.edu.utng.introduccion1;

import java.util.Date;

public class Persona {
	private Date fechaNacimiento;
	private String nombre;
	/**
	 * metodo que define la persona
	 */
	public void getFechaNacimiento(){
		System.out.println("obtiene la fecha de nacimiento");
	}
	public void getNombre(){
		System.out.println("obtiene el nombre...");
	}
}
