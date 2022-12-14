package main.service;

import java.util.ArrayList;

import main.model.Contact;

public class ContactService {

	public ArrayList<Contact> contactList;				//Creating and Array list to house contacts 
	
	//constructor
	public ContactService() {
		contactList = new ArrayList<Contact>();			//instantiating list
	}
	
	//ADDING CONTACT
	public void addContact(Contact contact) {
		boolean present = false;						// bool to see if ID is currently in list
		//Iterate through current contact list to search for duplicate user
		for (Contact curr : contactList) {
			if(curr.getContactID().equalsIgnoreCase(contact.getContactID())){
				present = true;
				break;	
			}
		}
		//Adding new user if not present
		if(!present) {
			contactList.add(contact);
		}
		
	}
	
	//DELETING CONTACT
	public void deleteContact(String contactID) {
		//Iterate through current contact list to search for user
		for (Contact curr : contactList) {
			if(curr.getContactID().equalsIgnoreCase(contactID)){
				contactList.remove(curr);
				break;	
			}
		}
	}
	
	//UPDATING FIRST NAME
	public void updateFirstName(String contactID, String fName) {
		//Iterate through current contact list to search for user
		for (Contact curr : contactList) {
			if(curr.getContactID().equalsIgnoreCase(contactID)){
				curr.setFirstName(fName);
				break;	
			}
		}
	}
	
	//UPDATING LAST NAME
	public void updateLastName(String contactID, String lName) {
		//Iterate through current contact list to search for user
		for (Contact curr : contactList) {
			if(curr.getContactID().equalsIgnoreCase(contactID)){
				curr.setLastName(lName);
				break;	
			}
		}
	}
	
	//UPDATING PHONE NUMBER
	public void updatePhoneNumber(String contactID, String phNum) {
		//Iterate through current contact list to search for user
		for (Contact curr : contactList) {
			if(curr.getContactID().equalsIgnoreCase(contactID)){
				curr.setPhNumber(phNum);
				break;	
			}
		}
	}
	
	//UPDATING ADDRESS
	public void updateAddress(String contactID, String address) {
		//Iterate through current contact list to search for user
		for (Contact curr : contactList) {
			if(curr.getContactID().equalsIgnoreCase(contactID)){
				curr.setAddress(address);
				break;	
			}
		}
	}
}
