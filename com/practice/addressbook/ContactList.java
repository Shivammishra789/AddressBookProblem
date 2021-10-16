package com.practice.addressbook;

public class ContactList {
	
	//variables
	private String firstName, lastName, address, city, state, zip, phoneNo, emailId;

	public ContactList(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNo, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "ContactList [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}
	
}