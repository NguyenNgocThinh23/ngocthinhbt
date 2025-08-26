package Lec6_Arrays_ArrayList;
import java.util.Scanner;
public class Ex3_CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to find: ");
        int x = scanner.nextInt();
        int count = 0;
        for (int number : numbers) {
            if (number == x) {
                count++;
            }
        }
        System.out.println("The number " + x + " appears " + count + " times.");
        scanner.close();
    }
}
