package com.web.java;

import java.util.Scanner;

public class GuessNumber_30 {

	public static void main(String[] args) {
		 int randomNumber = (int) (Math.random() * 9) + 1; 
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("I have selected a number between 1 and 9. Can you guess what it is?");
	        
	        int guess;
	        do {
	            System.out.print("Enter your guess: ");
	            while (!scanner.hasNextInt()) {
	                System.out.println("Please enter a valid number between 1 and 9.");
	                scanner.next();
	            }
	            guess = scanner.nextInt();
	            
	            if (guess < randomNumber)
	                System.out.println("Too low! Try again.");
	            else if (guess > randomNumber)
	                System.out.println("Too high! Try again.");
	            else
	                System.out.println("Congratulations! You guessed it right!");
	        } while (guess != randomNumber);
	        
	        scanner.close();
	    }

	}


