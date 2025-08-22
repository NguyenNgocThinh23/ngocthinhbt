package Lec5_Excercise;
import java.util.Scanner;
public class Ex6_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of digits of " + originalNumber + " is: " + sum);
        scanner.close();
    }
}

