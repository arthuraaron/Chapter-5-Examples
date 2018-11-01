package aaronarthur.Ch5Examples;

// Aaron Arthur 11/18 Compares strings

import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Initialize variables
		String temp;
		
		// Prompt user for information
		System.out.println("Welcome to the city comparation program!");
		System.out.print("Please enter the name of a city: ");
		String city1 = input.nextLine();
		
		System.out.print("Please enter another city name: ");
		String city2 = input.nextLine();
		
		// Compare the 2 cities
		if (city1.compareTo(city2) < 0) {
			System.out.println("The cities in alphabetical order are " + city1 + " " + city2);	
		}
		else {
			
			System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
		}
		

	}

}
