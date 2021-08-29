package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int passwordDefaultLength = 10;
	private String companySuffix = "company.com";
	
	//Constructor to receive first and lastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//call a method asking for the department return the department
		this.department = setDepartment();
		
		// Call a method that returns a random password
		this.password = randomPassword(passwordDefaultLength);
		System.out.println("Your password is: " + password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix.toLowerCase();
	}
	// Ask for the department
	private String setDepartment() {
		System.out.print("New worker: " + firstName + " " + lastName + "\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting \n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "Sales";}
		else if (depChoice == 2) {return "Development";}
		else if (depChoice == 3) {return "Accounting";}
		else {return ""; }
		}
	
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// setters & getters mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
		public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	//setter and getter  alternate email
	

	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	//change the password
	public void ChangePassword(String password) {
		this.password = password;
	}
	
	public String ShowInfo() {
		return "Display Name: " + firstName + " " + lastName +
			"\nCompany Email: " + email +
			"\nMailbox Capacity: " + mailboxCapacity + "mb.";
		
	}
}
