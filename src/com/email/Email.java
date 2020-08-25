package com.email;

public class Email {

	public static void main(String[] args) {

		EmailApp email = new EmailApp("Samuel", "Komane", "");
		email.getEmail();
		System.out.println(email.randomPassword(8));
	}
}
