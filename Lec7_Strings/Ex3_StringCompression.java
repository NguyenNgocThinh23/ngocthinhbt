package Lec7_Strings;
import java.util.Scanner;
public class Ex3_StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi can nen: ");
        String input = scanner.nextLine();
        String compressedOutput = compress(input);
        System.out.println("Chuoi sau khi nen: " + compressedOutput);
        scanner.close();
    }
    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder compressedString = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressedString.append(str.charAt(i));
                compressedString.append(count);
                count = 1;
            }
        }
        compressedString.append(str.charAt(str.length() - 1));
        compressedString.append(count);
        return compressedString.toString();
    }
}
