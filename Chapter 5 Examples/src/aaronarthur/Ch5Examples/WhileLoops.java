package aaronarthur.Ch5Examples;

// Aaron Arthur 11/18 Working with while loops

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Their decaying green bodies stretch out, melting into the horizon.");
		System.out.println("Your hero unsheathes his sword for the last fight of his life. \n");
		
		int health = 10;
		int trolls = 0;
		int damage = 3;
		
		while (health > 0) {
			trolls ++;
			health = health - damage;
			System.out.println("Your hero swings and defeats an evil troll, but takes " 
					+ damage + " damage points.\n");
		}
		
		System.out.println("Your hero fought valiantly and defeated " + trolls + " trolls.");
		System.out.println("But alas, your hero is no more.");
		*/
		
		/*
		int sum = 0, i = 1;
		while (i < 10) {
			sum += i;
			i++;
			System.out.println(sum);
		}
		System.out.println("Sum is " + sum);
		*/
		
		int question = 1;
		while (question <= 10) {
		
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		
		System.out.print(question + ": What is " + number1 + " + " + number2 + "?: ");
		int answer = input.nextInt();
		
		while (number1 + number2 != answer) {
			System.out.println("Wrong answer. Try again.\n");
			System.out.print(question + ": What is " + number1 + " + " + number2 + "?: ");
			answer = input.nextInt();
		}
		
		System.out.println("Correct!\n");
		question += 1;
		
		}
		System.out.println("You have correctly answered 10 questions. ");
		
	}

}
