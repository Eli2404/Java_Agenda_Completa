package com.softtek.java.academy.service;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.service.ContactServiceData;
import com.softtek.java.academy.service.ContactServiceDataMemoryImpl;;

public class PlaceholderContacts {
	private Contact contact;
	private Contact friend;

	public static void main(String[] args) {
		PlaceholderContacts p = new PlaceholderContacts();
		p.crearContactos();

		ContactServiceData csd = new ContactServiceDataMemoryImpl();
		Contact myContact = csd.createContact(p.contact);
		Contact myFriendContact = csd.createContact(p.friend);

		Contact[] contacts = csd.findAll();
		for (Contact c : contacts) {
			System.out.println(c);
		}
		
//		Contact[] contactsId = csd.findById("asjdalskdjas");
//		for (Contact c : contactsId) {
//			System.out.println(c);
//		}
//		
		
		Contact contactsEmail = csd.findByEmail("javacAcademy@softtek");
		System.out.println(contactsEmail);
		
		System.out.println("El contacto Eli se actualizo: " +  csd.updateContact("Eli", "eli.hdz"));
		for (Contact c : contacts) {
			System.out.println(c);
		}
		
		System.out.println("el contacto se elimino " +  csd.deleteContact("Eli"));
		
		for (Contact c : contacts) {
			System.out.println(c);
		}
		
		
		
//		for (Contact c : contactsEmail) {
//			System.out.println(c);
//		}
		

	}

	public void crearContactos() {
		contact = new Contact();
		contact.setFirstName("Eli");
		contact.setLastName("Hdz");
		contact.setMotherName("Granados");
		contact.setEmail("javacAcademy@softtek.com");
		contact.setPhoneNumber("987123456");

		friend = new Contact("2", "Elizabeth", "Granados", "Hernandez", "987456123", "java-softtek@hotmail.com",
				ContactType.FRIEND);
	}

}