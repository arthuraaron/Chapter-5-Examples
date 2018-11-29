package aaronarthur.Ch5Examples;

import java.util.Scanner;

// Aaron Arthur 11/18 Guesses the user's birthday

public class BirthdayGuess {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Binary numbers
		final int NUM128 = 128;
		final int NUM64 = 64;
		final int NUM32 = 32;
		final int NUM16 = 16;
		final int NUM8 = 8;
		final int NUM4 = 4;
		final int NUM2 = 2;
		final int NUM1 = 1;
		
		// Sets of numbers
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		
		// Input number
		int inputnum = 0;
		
		// Conversion placeholder
		int whatsLeft;
		
		
		for (int i = 0; i < 31; i++) {
		String binnum = "";
		//System.out.print("Enter a number between 1 and 255: ");
		//inputnum = input.nextInt();
		inputnum = inputnum + 1;
		
		
		// Initialize what's left
		whatsLeft = inputnum;
		
		// Creating binary number in string format
		if (inputnum >= NUM128) {
			whatsLeft = inputnum - NUM128;
			binnum = binnum+"1";
			
		}
		else {
			binnum = binnum+"0";
			
		}
		
		if (whatsLeft >= NUM64) {
			whatsLeft = whatsLeft - NUM64;
			binnum = binnum+"1";
		}
		else {
			binnum = binnum+"0";
			
		}
		
		if (whatsLeft >= NUM32) {
			whatsLeft = whatsLeft - NUM32;
			binnum = binnum+"1";
		}
		else {
			binnum = binnum+"0";
			
		}
		
		if (whatsLeft >= NUM16) {
			whatsLeft = whatsLeft - NUM16;
			binnum = binnum+"1";
		}
		else {
			binnum = binnum+"0";
			
		}
		
		if (whatsLeft >= NUM8) {
			whatsLeft = whatsLeft - NUM8;
			binnum = binnum+"1";
		}
		else {
			binnum = binnum+"0";
			
		}
		
		if (whatsLeft >= NUM4) {
			whatsLeft = whatsLeft - NUM4;
			binnum = binnum+"1";
		}
		else {
			binnum = binnum+"0";
			
		}
		
		if (whatsLeft >= NUM2) {
			whatsLeft = whatsLeft - NUM2;
			binnum = binnum+"1";
		}
		else {
			binnum = binnum+"0";
			
		}
		
		if (whatsLeft >= NUM1) {
			whatsLeft = whatsLeft - NUM1;
			binnum = binnum+"1";
		}
		else {
			binnum = binnum+"0";
			
		}
		
		// Display
		System.out.println("The binary number for " + inputnum + " is " + binnum);
		
		// Check indexing of binary number
		char xnum7 = binnum.charAt(7);
		char xnum6 = binnum.charAt(6);
		char xnum5 = binnum.charAt(5);
		char xnum4 = binnum.charAt(4);
		char xnum3 = binnum.charAt(3);
		
		// Assign to sets
		if (xnum7 == '1') {
			set1 = set1 + inputnum;
		}
		if (xnum6 == '1') {
			set2 = set2 + inputnum;
		}
		if (xnum5 == '1') {
			set3 = set3 + inputnum;
		}
		if (xnum4 == '1') {
			set4 = set4 + inputnum;
		}
		if (xnum3 == '1') {
			set5 = set5 + inputnum;
		}
		
		// Display
		System.out.println("set1 is: " + set1);
		System.out.println("set2 is: " + set2);
		System.out.println("set3 is: " + set3);
		System.out.println("set4 is: " + set4);
		System.out.println("set5 is: " + set5);
		
		
		
		}
		
		
		
		
	}

}
