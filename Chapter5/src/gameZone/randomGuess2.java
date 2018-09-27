package gameZone;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;

public class randomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userGuess;
		int computerSecret;
		
		String result;
		
		computerSecret = (int )(Math.random()* 10 + 1);
		
		Scanner input = new (System.in);
		
		System.out.println("Pick a number any number as long as it's no higher than 10");
		userGuess = input.nextInt();
	
		if(userGuess  <  computerSecret) {
			result = "The number is higher";
		}
		else {
		else if (userGuess > computerSecret) {
			result = "The number is lower";
		}
		else if (userGuess == computerSecret) {
			result = "You win!";
		}
		displayMessage(result);
		System.out.println("Do you want to quit 1 for yes 2 for no. >>");
			result = "You lose, computers number was "+ computerSecret;
			quit = input.nextInt();
			}while(1 !=quit || userGuess != computerSecret);
			
		}
		public static void displayMessage
	
	}
	
}
