package lab06;

//************************************************************
//Guess.java
//
//Play a game where the user guesses a number from 1 to 10
//
//************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess {
	public static void main(String[] args)
	{
		int numToGuess; //Number the user tries to guess
		int guess; //The user's guess
		int guessTrys;
		int guessLow;
		int guessHigh;
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		//randomly generate the number to guess
		numToGuess = generator.nextInt(10) + 1;
		//print message asking user to enter a guess
		System.out.println("Guess a number between 1 and 10");
		//read in guess
		guess = scan.nextInt();
		guessTrys = 1;
		guessLow = 0;
		guessHigh = 0;
		while (guess != numToGuess) //keep going as long as the guess is wrong
		{
			//print message saying guess is wrong
			if (guess < numToGuess) {
				System.out.println("That number is too low, try a bigger number.");
				guessLow++;
				
			} else {
				System.out.println("That number is too high, try a smaller number");
				guessHigh++;
			}
			//get another guess from the user
			guess = scan.nextInt();
			guessTrys++;
		}
		//print message saying guess is right
		System.out.println("Guesses too low: " + guessLow);
		System.out.println("Guesses too high: " + guessHigh);
		System.out.println("Congratulations, you guessed correctly in " + guessTrys + " attempts!");
	}
}