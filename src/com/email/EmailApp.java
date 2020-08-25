package com.email;

public class EmailApp {

	String firstName;
	String lastName;
	String department;
	String company = "Idol.Com";
	String password;
	int mailboxCapacity = 100;

	public EmailApp(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;

		// Call random password generator method
		//randomPassword(8);
	}

	// Random password;
	public String randomPassword(int length) {
		String PasswordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890abcdefghijklmnopqrstuvwxyz";
		
		char[] charactor = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * PasswordSet.length());
			charactor[i] = PasswordSet.charAt(random);
		}
		return new String(charactor);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	// Generate email
	public void getEmail() {
		System.out.println("Email: " + firstName + "." + lastName + "@" + department + "." + company);
	}

	// setPassword
	public void setPassword(String password) {
		this.password = password;
	}

}
