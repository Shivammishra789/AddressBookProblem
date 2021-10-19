package com.practice.addressbook;

import java.util.Scanner;

public class ContactList {

	Scanner sc = new Scanner(System.in);

	//variables
	private String firstName, lastName, address, city, state, zip, phoneNo, emailId;

	public ContactList() {

		//taking input from user to create new contact
		System.out.println("enter first name");
		firstName = sc.nextLine();

		System.out.println("enter last name");
		lastName = sc.nextLine();

		System.out.println("enter address");
		address = sc.nextLine();

		System.out.println("enter city");
		city = sc.nextLine();

		System.out.println("enter state");
		state = sc.nextLine();

		System.out.println("enter zip code");
		zip = sc.nextLine();

		System.out.println("enter phone number");
		phoneNo = sc.nextLine();

		System.out.println("enter email Id");
		emailId = sc.nextLine();
	}

	@Override
	public String toString() {
		return "ContactList [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}
	

}

