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


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "ContactList [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}


}

