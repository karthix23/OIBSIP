import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxRounds = 3; // Number of rounds
        int totalScore = 0;

        System.out.println("Welcome to the 'Guess the Number' game!");

        for (int round = 1; round <= maxRounds; round++) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int attempts = 5; // Limiting the number of attempts
            int roundScore = 0;

            System.out.println("\nRound " + round + ":");
            while (attempts > 0) {
                System.out.print("Enter your guess (1-100): ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    roundScore = attempts * 10; // Points based on remaining attempts
                    System.out.println("Congratulations! You've guessed the number.");
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Higher!");
                } else {
                    System.out.println("Lower!");
                }
                attempts--;
                System.out.println("Attempts left: " + attempts);
            }

            if (roundScore == 0) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + numberToGuess);
            } else {
                System.out.println("You scored " + roundScore + " points this round.");
            }

            totalScore += roundScore;
        }

        System.out.println("\nGame over! Your total score is: " + totalScore);
        scanner.close();
    }
}
