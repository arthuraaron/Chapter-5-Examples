package aaronarthur.Ch5Examples;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int leftSide, rightSide;
		int x = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Solving 5(-3x - 2) - (x - 3) = -4(4x + 5) + 13");
		do {
			leftSide = 5 * (-3 * x - 2) - (x - 3);
			rightSide = -4 *(4 * x + 5) + 13;
			x++;
			
		} while (leftSide != rightSide);
		
		System.out.println("x = " + x);

	}

}
