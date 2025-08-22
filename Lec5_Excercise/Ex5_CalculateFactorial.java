package Lec5_Excercise;
import java.util.Scanner;
public class Ex5_CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer N: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Cannot calculate factorial for negative numbers.");
            scanner.close();
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
        scanner.close();
    }
}

