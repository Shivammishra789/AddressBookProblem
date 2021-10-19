package com.practice.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	Scanner sc = new Scanner(System.in);

	//creating arraylist to create store contact
	ArrayList<ContactList> contactData = new  ArrayList<ContactList>();

	public static void main(String[] args) {
		AddressBookMain object = new AddressBookMain();
		object.addContact();
	}

	public void addContact() {
		System.out.println("enter 1 to add new contact");
		int startAdd = sc.nextInt();
		if(startAdd == 1) {
			while(startAdd == 1) {
				ContactList person = new ContactList();
				contactData.add(person);							//adding contact to arraylist
				System.out.println("enter 1 to add more contact or enter 0 to exit");
				startAdd = sc.nextInt();
				if(startAdd == 0) {
					System.out.println("your contact list is updated");
					System.out.println();
					break;
				}		
			}
		}
		else {
			System.out.println("enter valid input");
			addContact();
		}
		System.out.println("to edit existing contact press 5 ");
		int edit = sc.nextInt();
		if(edit == 5) {
			editContact();
		}

		//displaying contact list
		for(int i = 0; i < contactData.size(); i++) {
			System.out.println(contactData.get(i));
		}
	}
	public void editContact() {
		System.out.println("enter first name to edit that contact");
		Scanner sc = new Scanner(System.in);
		String editName = sc.nextLine();
		for(int j = 0 ; j <= contactData.size() ; j++) {
			if(editName.equalsIgnoreCase(contactData.get(j).getFirstName())) {
				ContactList newperson = new ContactList();
				contactData.set(j,newperson);							//editing contact in arraylist
				System.out.println("contact updated");
				System.out.println();
				System.out.println("to edit any other contact enter 5 or enter other number to exit");
				int edit = sc.nextInt();
				if(edit == 5) {
					editContact();
					break;
				}
				break;
			}
			System.out.println("entered name not found");
			break;

		}
	}
}

