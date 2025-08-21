package Lec5_Excercise;
import java.util.Scanner;
public class Ex10_DrawAnIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int h = scanner.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == h) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
