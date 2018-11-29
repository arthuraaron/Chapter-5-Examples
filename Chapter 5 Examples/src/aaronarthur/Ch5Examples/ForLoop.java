package aaronarthur.Ch5Examples;

import java.util.Scanner;

// Aaron Arthur 11/18 Testing for loops

public class ForLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = 0;
		
		while (count < 100) {
			System.out.println(count);
			count++;
		}
		
		
		count = 0;
		do {
			System.out.println(count);
			count++;
		} while (count < 100);
		
		
		for (count = 0 ; count < 100 ; count++) {
			System.out.println(count);
		}
		
		
	}

}
