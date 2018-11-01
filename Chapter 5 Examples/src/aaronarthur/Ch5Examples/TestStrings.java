package aaronarthur.Ch5Examples;

import java.util.Scanner;

public class TestStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		System.out.print("Enter a character: ");
		char x = input.nextLine().charAt(0);
		System.out.println(x);
		*/
		
		String message = "Welcome to Java";
		String message2 = " and Java is fun.";
		System.out.println(message.length());
		System.out.println("Welcome to Java".length());
		System.out.println(message.charAt(4));
		
		
		/*
		message += " and Java is fun.";		
		message += message2;
		message = message + message2;
		
		
		String x = input.next();
		x = input.nextLine();
		*/
		
		
		if (!message.equalsIgnoreCase("Welcome to Java")) {
			System.out.println("You're in.");
		}
		else {
			System.out.println("You're not in.");
		}
		
		
		int x = message.compareTo(message2);
		System.out.println(x);
		boolean y = message.startsWith("Wel");
		System.out.println(y);
		
	}

}
