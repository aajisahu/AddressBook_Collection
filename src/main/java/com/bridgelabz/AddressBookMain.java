package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
	
    public static void main(String[] args) {
        System.out.println("Welcome into the Program of Address Book System !!");
        NewAddressBook person = new NewAddressBook();
        Scanner sc=new Scanner(System.in);
        person.addContact();
    
        System.out.println("Enter Y To Edit The Contact");
        String op = sc.nextLine();
        
        if(op.equals("y") || op.equals("Y") ) {
            person.editContact(); //Calling The Edit Contact Method
            System.exit(0);
        }
    
    }
}