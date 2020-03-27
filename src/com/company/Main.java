package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is the Number Guessing Game. Here are the rules: ");
        System.out.println("I will select a random number between 1-100 that you must guess.");
        System.out.println("If you guess incorrectly, I will tell you if the number is either higher or lower.");
        System.out.println("Keep guessing until you get the number right!!!");
        System.out.println("");
        System.out.println("Let's Play!");
        System.out.println("Enter a guess between 1-100");

        String answer;
        int secretNumber = (int) (Math.random() * 100) + 1;
        int numberOfGuesses = 1;
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();
        if (guess < secretNumber) {
            System.out.println("Guess higher");
        } else if (guess > secretNumber) {
            System.out.println("Guess lower");
        } else {
            System.out.println("Congratulations! It took you " + numberOfGuesses + " tries. Do you want to play again?");
        }


        do {
            System.out.println("Enter your guess");
            keyboard = new Scanner(System.in);
            guess = keyboard.nextInt();
            ++numberOfGuesses;

            if (guess < secretNumber) {
                System.out.println("Guess higher");
            } else if (guess > secretNumber) {
                System.out.println("Guess lower");
            } else {
                System.out.println("Congratulations! It took you " + numberOfGuesses + " tries.");
            }
        } while (guess != secretNumber);

        System.out.println("Maybe you'll do better next time. Do you want to play again? (Yes or No)");
        Scanner key = new Scanner(System.in);
        answer = key.next();
        if (answer.equals("yes")) {
            do {main(args);

            } while (guess != secretNumber);
        }

        else if (answer.equals("no")) {
            System.out.println("Okay, thanks for playing!");
        }
    }
}
