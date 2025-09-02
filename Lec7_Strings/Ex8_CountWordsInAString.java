package Lec7_Strings;
import java.util.Scanner;
public class Ex8_CountWordsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi: ");
        String input = scanner.nextLine();
        String trimmedInput = input.trim();
        int wordCount;
        if (trimmedInput.isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = trimmedInput.split("\\s+");
            wordCount = words.length;
        }
        System.out.println("So tu trong chuoi la: " + wordCount);
        scanner.close();
    }
}
