package com.practice.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
	
	Scanner sc = new Scanner(System.in);

	//creating arraylist to store contact
	ArrayList<ContactList> contactData = new  ArrayList<ContactList>();
	
	int operation;
	
	public static void main(String[] args) {
		AddressBookMain object = new AddressBookMain();
		object.addContact();
	}
	public void contactBuilder() {
		System.out.println(" to add contact press 1 \n to edit existing contact press 5 \n "
				+ "to delete existing contact press 9 \n to exit press 0");
		int operation = sc.nextInt();
		if(operation == 1) {
			addContact();
		}
		else if(operation == 5) {
			editContact();
		}
		else if(operation == 9) {
			deleteContact();
		}
		else if(operation == 0) {
			displayContact();
		}
		else {			
			System.out.println("enter valid input");
			contactBuilder();
		}
	}
	public void addContact() {
		System.out.println("enter 1 to add new contact");
		int operation = sc.nextInt();
		if(operation == 1) {
			while(operation == 1) {
				ContactList person = new ContactList();
				contactData.add(person);							//adding contact to arraylist
				System.out.println("contact added");
				System.out.println();
				contactBuilder();
			}
		}
		else {
			System.out.println("enter valid input");
			System.out.println();
			addContact();
		}
	}
	public void editContact() {
		System.out.println("enter first name to edit that contact");
		Scanner sc = new Scanner(System.in);
		String editName = sc.nextLine();
		for(int j = 0 ; j <= contactData.size() ; j++) {
			if(editName.equalsIgnoreCase(contactData.get(j).getFirstName())) {
				ContactList newperson = new ContactList();
				contactData.set(j,newperson);						//editing contact in arraylist
				System.out.println("contact updated");
				System.out.println();
				contactBuilder();
			}
			System.out.println("entered name not found");
			contactBuilder();
		}
	}
	public void deleteContact() {
		System.out.println("enter first name to delete that contact");
		Scanner sc = new Scanner(System.in);
		String deleteName = sc.nextLine();
		for(int j = 0 ; j <= contactData.size() ; j++) {
			if(deleteName.equalsIgnoreCase(contactData.get(j).getFirstName())) {
				contactData.remove(j);								//deleting contact in arraylist
				System.out.println("contact deleted successfully");
				System.out.println();
				contactBuilder();			
			}
			System.out.println("entered name not found");
			contactBuilder();
		}
	}
	public void displayContact() {

		for(int i = 0; i < contactData.size(); i++) {
			System.out.println(contactData.get(i));				//displaying contact list
		}
	}
}

