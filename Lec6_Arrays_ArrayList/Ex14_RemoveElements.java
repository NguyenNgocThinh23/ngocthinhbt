package Lec6_Arrays_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex14_RemoveElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        System.out.println("Original list: " + numbers);

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > 50) {
                numbers.remove(i);
            }
        }
        System.out.println("List after removing elements > 50: " + numbers);
        scanner.close();
    }
}
