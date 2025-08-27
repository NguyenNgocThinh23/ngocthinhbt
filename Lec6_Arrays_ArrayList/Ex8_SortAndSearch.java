package Lec6_Arrays_ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Ex8_SortAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.print("Enter a number to search: ");
        int key = scanner.nextInt();
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("The number " + key + " was found at index " + foundIndex + ".");
        } else {
            System.out.println("The number " + key + " was not found.");
        }
        scanner.close();
    }
}
