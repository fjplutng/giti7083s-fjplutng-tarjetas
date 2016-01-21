package mx.edu.utng.asociaciones;

public class Contact {
	private String name;
	private String primaryContactMethod;
	private String emailAddress;
	private String faxNumber;
	public String getName() {
		return name;
	}
	public String getPrimaryContactMethod() {
		return primaryContactMethod;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrimaryContactMethod(String primaryContactMethod) {
		this.primaryContactMethod = primaryContactMethod;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	

}
