import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void playGame(int randomNumber) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int guess;
        int round = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 10 chances to guess the number between 1 and 100.");

        while (round < 10) {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You won the game!");
                printScore(round);
                return;
            }

            round++;
        }

        System.out.println("You lost the game. The correct number was: " + randomNumber);
    }

    public static void printScore(int rounds) {
        int score;

        switch (rounds) {
            case 0:
                score = 100;
                break;
            case 1:
                score = 90;
                break;
            case 2:
                score = 80;
                break;
            case 3:
                score = 70;
                break;
            case 4:
                score = 60;
                break;
            case 5:
                score = 50;
                break;
            case 6:
                score = 40;
                break;
            default:
                score = 35;
                break;
        }

        System.out.println("Your score is: " + score);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Random number between 1 and 100

        playGame(randomNumber);

        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = scanner.nextLine().trim().toLowerCase();

        while (playAgain.equals("yes")) {
            playGame(randomNumber);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().toLowerCase();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
