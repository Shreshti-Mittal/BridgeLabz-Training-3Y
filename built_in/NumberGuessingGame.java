import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int min = 1, max = 100;

    public static int generateGuess() {
        return random.nextInt(max - min + 1) + min;
    }

    public static String getUserFeedback(int guess) {
        System.out.println("Is your number " + guess + "?");
        System.out.print("Enter feedback (high/low/correct): ");
        return scanner.nextLine().toLowerCase();
    }

    public static void updateRange(String feedback, int guess) {
        if (feedback.equals("high")) {
            max = guess - 1;
        } else if (feedback.equals("low")) {
            min = guess + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it.");
        String feedback = "";
        while (!feedback.equals("correct") && min <= max) {
            int guess = generateGuess();
            feedback = getUserFeedback(guess);
            if (!feedback.equals("correct")) {
                updateRange(feedback, guess);
            }
        }
        if (min > max) {
            System.out.println("It seems there's a contradiction in your feedback. Game over.");
        } else {
            System.out.println("I guessed it!");
        }
    }
}
