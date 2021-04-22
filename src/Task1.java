import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int numberToGuess = new Random().nextInt(100);
        int attempt = 5;
        int guess, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 100. You only have " + attempt + " attempts.");
        for (i = 0; i < attempt; i++) {
            int left = attempt - 1 - i;
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();
            if (guess == numberToGuess) {
                System.out.println("You guessed it!");
                break;
            } else if (guess > numberToGuess && i != attempt - 1) {
                System.out.println("Your number: " + guess + " is GREATER than the one you are trying to guess. You have " + left + " attempts left. Please try again");
            } else if (guess < numberToGuess && i != attempt - 1) {
                System.out.println("Your number: " + guess + " is LOWER than the one you are trying to guess. You have " + left + " attempts left. Please try again");
            }
        }
        if (i == attempt) {
            System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
        }
    }
}