package com.practice.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		addContact();										//calling method in main
	}

	public static void addContact() {

		Scanner sc = new Scanner(System.in);

		//creating arraylist to create store contact
		ArrayList<ContactList> contactData = new  ArrayList<ContactList>();

		System.out.println("enter 1 to add new contact");
		int startAdd = sc.nextInt();

		if(startAdd == 1) {
			while(startAdd == 1) {
				ContactList person = new ContactList();
				contactData.add(person);					//adding contact to arraylist
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

		//displaying contact list
		for(int i = 0; i < contactData.size(); i++) {
			System.out.println(contactData.get(i));
		}
	}
}

