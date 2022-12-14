package test.model;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.model.Contact;

class ContactTest {

	@Test
	void createCOntact() {
		Contact newCon = new Contact("1234567890", "Hank", "Rearden", "1112223333", "1122 Steel St");
		assertTrue(newCon.getAddress().equals("1122 Steel St"));
		assertTrue(newCon.getPhNumber().equals("1112223333"));
		assertTrue(newCon.getLastName().equals("Rearden"));
		assertTrue(newCon.getFirstName().equals("Hank"));
		assertTrue(newCon.getContactID().equals("1234567890"));
	}
	
	@Test
	void invalidContactID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Hank", "Rearden", "1112223333", "1122 Steel St");
		});
	}
	
	@Test
	void invalidFirstName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Hank0000000", "Rearden", "1112223333", "1122 Steel St");
		});
	}

	@Test
	void invalidLastName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Hank", "Rearden0000", "1112223333", "1122 Steel St");
		});
	}
	
	@Test
	void invalidPhoneNumber() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Hank", "Rearden", "11122233334", "1122 Steel St");
		});
	}
	
	@Test
	void invalidAddress() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Hank", "Rearden", "1112223333", "111111111222222222222333333333444444555");
		});
	}
}
