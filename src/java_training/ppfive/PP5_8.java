package java_training.ppfive;

import java.util.Random;
import java.util.Scanner;

public class PP5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        while (playAgain) {
            playGame(scanner, random);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    private static void playGame(Scanner scanner, Random random) {
        int randomNumber = random.nextInt(100) + 1;
        int guessCount = 0;
        int userGuess;

        System.out.println("Welcome to the Hi-Lo Game! Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess (or enter 0 to quit): ");
            userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess == 0) {
                System.out.println("Quitting the game. The correct number was: " + randomNumber);
                return;
            } else if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low. Try again!");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + guessCount + " guesses.");
            }
        } while (userGuess != randomNumber);
    }
}
