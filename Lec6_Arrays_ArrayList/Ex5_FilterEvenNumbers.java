package Lec6_Arrays_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex5_FilterEvenNumbers {
    public static ArrayList<Integer> filterEven(int[] numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        ArrayList<Integer> evenList = filterEven(numbers);
        System.out.println("Even numbers: " + evenList);
        scanner.close();
    }
}
