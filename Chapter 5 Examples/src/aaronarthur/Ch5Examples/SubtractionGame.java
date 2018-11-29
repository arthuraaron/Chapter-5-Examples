package aaronarthur.Ch5Examples;

/* Aaron Arthur
 * 11/27/18
 * A game that quizzes children on subtraction
 */

import java.util.Scanner;

public class SubtractionGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int QUESTION_COUNT = 5;
		int correctCount = 0;
		int count = 0;
		String output = " ";
		long startTime = System.currentTimeMillis();
		
		while (count < QUESTION_COUNT) {
			
		// Generate numbers
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		// Make the biggest go first
		if (number1 < number2) {
			int temp = number2;
			number2 = number1;
			number1 = temp;	
		}
		
		// Prompt user
		System.out.print((count+1) + ": What is " + number1 + " - " + number2 + "?: ");
		int answer = input.nextInt();
		
		// Display result
		if (number1 - number2 == answer) {
			System.out.println("Correct! \n");
			correctCount++;
		}
		else {
			System.out.println("Incorrect. \n" + number1 + " - " + number2 + " = " + (number1 - number2)
					+ "\n");
		}
		
		/*
		while (number1 - number2 != answer) {
			System.out.println("Wrong answer. Try again.\n");
			System.out.print((count+1) + ": What is " + number1 + " - " + number2 + "?: ");
			answer = input.nextInt();
		}
		
		System.out.println("Correct!\n");
		correctCount += 1;
		*/
		
		
		// Increment counter
		count++;
		output += "\n" + number1 + " - " + number2 + " = " + answer + 
				((number1 - number2 == answer) ? " Correct" : " Incorrect");
		
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		System.out.println("\nCorrect count is " + correctCount + "\nTest time is " + testTime / 1000
				+ " seconds\n" + output);

		

	}

}
