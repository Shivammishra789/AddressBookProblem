package com.practice.addressbook;

public class AddressBookMain {

	public static void main(String[] args) {

		ContactList person1 = new ContactList("Shivam", "Mishra", "Lane no 24", "Pune", "Maharashtra",
				"411039", "8830466378", "Shivammishra7789@gmail.com");
		ContactList person2 = new ContactList("Rahul", "Krishna", "No.2,AK street, 3rd Cross", "XXY city", "MMN state",
				"660666", "9194979295", "rahulkrisna@gmail.com");
		System.out.println(person1.toString());
		System.out.println(person2.toString());
	}
}
