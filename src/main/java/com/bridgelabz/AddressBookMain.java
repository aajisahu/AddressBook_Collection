package com.bridgelabz;

public class AddressBookMain {
	public static void main(String[] args) {
        System.out.println("Welcome into the Program of Address Book System !!");
        ContactDetails newContact = new ContactDetails();
        newContact.setFirstName("Ashish\n");
        newContact.setLastName("Sahu\n");
        newContact.setAddressCity("Bolangir\n");
        newContact.setState("Odisha\n");
        newContact.setEmail("@gmail.com\n");
        newContact.setZip(767001);
        newContact.setPhoneNumber( 9437390435L);
        System.out.println("The Contact is :\n" +newContact);

    }
}
