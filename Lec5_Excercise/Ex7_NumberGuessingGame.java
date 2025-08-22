package Lec5_Excercise;
import java.util.Random;
import java.util.Scanner;
public class Ex7_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; 
        int tries = 0;
        int userGuess;
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
        do {
            System.out.print("Your guess: ");
            userGuess = scanner.nextInt();
            tries++;
            if (userGuess > secretNumber) {
                System.out.println("Your guess is higher than the secret number.");
            } else if (userGuess < secretNumber) {
                System.out.println("Your guess is lower than the secret number.");
            } else {
                System.out.println("Congratulations! You guessed the secret number "
                        + secretNumber + " in " + tries + " tries!");
            }
        } while (userGuess != secretNumber);
        scanner.close();
    }
}

