package mx.edu.utng.asociaciones;

import java.util.List;

public class ContactGroup {
	private String name;
	private List<ContactGroup> contactGroups;
	private List<Contact> contacts;
	
	public ContactGroup(List<ContactGroup> contactGroups, List<Contact> contacts){
		this.contactGroups = contactGroups;
		this.contacts = contacts;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
