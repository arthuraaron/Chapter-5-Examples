package aaronarthur.Ch5Examples;

// Aaron Arthur 11/18 Converts hexadigit to decimal

import java.util.Scanner;

public class HexdigitToDec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Initialize variables
		int value1 = 0;
		int value2 = 0;
		int value3 = 0;
		
		
		// Get user input
		System.out.print("Enter a 3 digit hex digit (0-9 or A-F): ");
		String hexString = input.nextLine();
		
		// Make sure that the hexString contains only one digit
		if (hexString.length() != 3) {
			System.out.println("You must enter exactly three characters. ");
			System.exit(1);
			
		}
		
		
		char ch1 = Character.toUpperCase(hexString.charAt(0));		
		char ch2 = Character.toUpperCase(hexString.charAt(1));
		char ch3 = Character.toUpperCase(hexString.charAt(2));
		

		// Digit 1
		if (ch1 <= 'F' && ch1 >= 'A') {
			value1 = ch1 - 'A' + 10;
			
			
		}
		else if (Character.isDigit(ch1)) {
			value1 = ch1 - 48;
		}
		else {
			System.out.println("Your input is not a valid hex digit. ");
			System.exit(0);
			
		}
		
		
		// Digit 2
		if (ch2 <= 'F' && ch2 >= 'A') {
			value2 = ch2 - 'A' + 10;
			
			
		}
		else if (Character.isDigit(ch2)) {
			value2 = ch2 - 48;
		}
		else {
			System.out.println("Your input is not a valid hex digit. ");
			System.exit(0);
			
		}
		
		
		// Digit 3
		if (ch3 <= 'F' && ch3 >= 'A') {
			value3 = ch3 - 'A' + 10;
			
			
		}
		else if (Character.isDigit(ch3)) {
			value3 = ch3 - 48;
		}
		else {
			System.out.println("Your input is not a valid hex digit. ");
			System.exit(0);
			
		}
		
		int total = (int) value1 + value2 + value3;
		System.out.println("The values of your digits are " + value1 + ", "
				+ value2 + ", " + value3 + ". ");
		System.out.println("The total value of the digit is " + total + ". ");
		
		
	}

}
