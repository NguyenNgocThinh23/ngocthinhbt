package Lec7_Strings;
import java.util.Scanner;
public class Ex6_FindTheLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot cau: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Tu dai nhat trong cau la: " + longestWord);
        scanner.close();
    }
}
