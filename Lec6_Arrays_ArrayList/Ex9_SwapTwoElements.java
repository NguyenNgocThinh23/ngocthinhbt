package Lec6_Arrays_ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Ex9_SwapTwoElements {
    public static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            System.out.println("Invalid indices.");
            return;
        }
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the first index to swap: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter the second index to swap: ");
        int index2 = scanner.nextInt();
        System.out.println("Original array: " + Arrays.toString(numbers));
        swap(numbers, index1, index2);
        System.out.println("Array after swapping: " + Arrays.toString(numbers));
        scanner.close();
    }
}
