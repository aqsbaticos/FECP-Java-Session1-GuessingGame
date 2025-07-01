package org.example;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int secretNumber = (int)(Math.random()*5) + 1;
		int chances = 3, counter=1, userGuess; boolean isCorrect=false;
		Scanner in = new Scanner(System.in);

		System.out.println("I'm thinking of a number between 1 and 5.");
		while (chances!=0) {

			System.out.print("Guess " + counter++ + ": ");
			userGuess = in.nextInt();

			if (userGuess==secretNumber) {
				System.out.println("You guessed it!");
				isCorrect=true;
				break;
			}
			else System.out.println("Wrong guess.");

			chances--;
		}
		if (isCorrect) System.out.println("You win!");
		else System.out.println("You lose. The correct number was " + secretNumber + ".");
	}
}