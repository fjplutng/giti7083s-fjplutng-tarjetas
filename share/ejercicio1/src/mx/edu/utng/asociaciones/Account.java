package mx.edu.utng.asociaciones;

import java.util.List;

public class Account {
	private String name;
	private String emailAddress;
	private List<AdressBook> isAccessBy;
	
	public Account(List<AdressBook> isAccessBy){
		this.isAccessBy = isAccessBy;
	}
	
	/**
	 * creando los métodos para los atributos getters o accesores
	 */
	public String getName() {
		return name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * creando los cambiadores o mutators de los atributos
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
