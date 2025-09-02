package Lec7_Strings;
import java.util.Scanner;
public class Ex9_FormatANumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi so: ");
        String numberStr = scanner.nextLine();
        StringBuilder sb = new StringBuilder(numberStr);
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ',');
        }
        System.out.println("Chuoi sau khi dinh dang: " + sb.toString());
        scanner.close();
    } 
}
