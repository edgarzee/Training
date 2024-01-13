package java_training.ppfive;

import java.util.Random;
import java.util.Scanner;

public class PPNew5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userWins = 0;
        int computerWins = 0;
        int ties = 0;

        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Choose rock, paper or scissors:");
            String userChoice = scanner.nextLine().toLowerCase();

            String[] options = {"rock", "paper", "scissors"};
            int randomIndex = random.nextInt(3);
            String computerChoice = options[randomIndex];

            System.out.println("Your choice: " + userChoice);
            System.out.println("Computer choice: " + computerChoice);

            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);

            if (result.equals("You win.")) {
                userWins++;
            } else if (result.equals("You lose.")) {
                computerWins++;
            } else {
                ties++;
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = scanner.nextLine().toLowerCase();
            playAgain = playAgainResponse.equals("yes");

        }

        System.out.println("Final results:");
        System.out.println("You won: " + userWins + " times.");
        System.out.println("You lost: " + computerWins + " times.");
        System.out.println("You tied: " + userWins + " times.");

        scanner.close();
    }

        private static String determineWinner(String userChoice, String computerChoice){
            if(userChoice.equals(computerChoice)){
                return "It's a tie.";
            } else if (
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("rock"))){
                return "You win.";
            } else{
                return "You lose.";
            }
        }
}
