package Lec5_Excercise;
import java.util.Scanner;
public class Ex9_CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int number, count = 0;
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number == 0) break;
            sum += number;
            count++;
        }
        if (count > 0) {
            double average = sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No numbers were entered to calculate the average");
        }
        scanner.close();
    }
}
