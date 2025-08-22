package Lec5_Excercise;
import java.util.Scanner;
public class Ex4_DrawARightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int h = scanner.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
