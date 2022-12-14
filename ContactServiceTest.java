package test.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import main.model.Contact;
import main.service.ContactService;

class ContactServiceTest {

	ContactService conSvc = new ContactService();
	Contact contact1 = new Contact("1234567890", "Hank", "Rearden", "1112223333", "1122 Steel St");
	Contact contact2 = new Contact("1234567890", "Duplicate", "Duplicate", "1112223333", "Duplicate");
	Contact contact3 = new Contact("0987654321", "Guy", "Montag", "4445556666", "1122 Firemans Pl");
	
	@Test
	void addContactSuccess() {
		conSvc.addContact(contact1);
		Assert.assertEquals(conSvc.contactList.size(), 1);
	}
	
	@Test
	void addContactFailure() {
		conSvc.addContact(contact1);
		conSvc.addContact(contact2);
		Assert.assertEquals(conSvc.contactList.size(), 1);
	}
	
	@Test
	void removeContact() {
		conSvc.addContact(contact1);
		conSvc.deleteContact(contact1.getContactID());
		Assert.assertEquals(conSvc.contactList.size(), 0);
	}
	
	@Test
	void updateContactFirstName() {
		conSvc.addContact(contact1);
		conSvc.updateFirstName(contact1.getContactID(), "Charles");
		Assert.assertEquals(conSvc.contactList.get(0).getFirstName(), "Charles");
	}
	
	@Test
	void updateContactLasttName() {
		conSvc.addContact(contact1);
		conSvc.updateLastName(contact1.getContactID(), "Darwin");
		Assert.assertEquals(conSvc.contactList.get(0).getLastName(), "Darwin");
	}
	
	@Test
	void updateContactPhone() {
		conSvc.addContact(contact1);
		conSvc.updatePhoneNumber(contact1.getContactID(), "0005678907");
		Assert.assertEquals(conSvc.contactList.get(0).getPhNumber(), "0005678907");
	}
	
	@Test
	void updateAddress() {
		conSvc.addContact(contact1);
		conSvc.updateAddress(contact1.getContactID(), "1234 Evolution Way");
		Assert.assertEquals(conSvc.contactList.get(0).getAddress(), "1234 Evolution Way");
	}

}
