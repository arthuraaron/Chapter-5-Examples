package aaronarthur.Ch5Examples;

//Aaron Arthur 11/18 Working with printf

import java.util.Scanner;

public class TestingPrintf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		// Formatting money
		double amount = 12618.98;
		double interestRate = 0.0013;
		double interest = amount * interestRate;
		System.out.printf("Interest is $%4.2f", interest);
		
		
		// Formatting numbers
		int count = 5;
		double amount = 45.56;
		System.out.printf("count is %d and amount is %4.2f", count, amount);
		
		
		// Formatting strings
		String word = "hello world";
		System.out.printf("%100s", word);
		*/
		
		System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);
		System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
		System.out.printf("%-8d%-8s%-8.1f",  1234, "Java", 5.63);
	
	}

}
