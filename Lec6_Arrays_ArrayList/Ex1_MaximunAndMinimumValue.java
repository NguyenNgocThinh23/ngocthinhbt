package Lec6_Arrays_ArrayList;
import java.util.Scanner;
public class Ex1_MaximunAndMinimumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elemants in the array: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid size. Exiting program.");
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum value is: " + max);
        System.out.println("The minimum value is: " + min);
        scanner.close();
    }
}