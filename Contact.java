package main.model;


public class Contact {

	//Private variables
	private String contactID;
	private String firstName;
	private String lastName;
	private String phNumber;
	private String address;
	
	
	public Contact(String contactID, String firstName, String lastName, String phNumber, String address ) {
		this.setContactID(contactID);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhNumber(phNumber);
		this.setAddress(address);
	}
	

	//getters and setters
	public String getContactID() {
		return contactID;
	}

	public void setContactID(String contactID) {
		if(contactID.length() == 10 && contactID != null) {
			this.contactID = contactID;
		}else {
			throw new IllegalArgumentException("Invalid Contact ID given");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}else {
			throw new IllegalArgumentException("Invalid First Name given");
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}else {
			throw new IllegalArgumentException("Invalid Last Name given");
		}
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		if(phNumber.length() == 10 && phNumber != null) {
			this.phNumber = phNumber;
		}else {
			throw new IllegalArgumentException("Invalid Phone number given");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if(address.length() <= 30 && address != null) {
			this.address = address;
		}else {
			throw new IllegalArgumentException("Invalid Address given");
		}
	}
	
	
}
