package Lec7_Strings;
import java.util.Scanner;
public class Ex1_ReverseTheWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot cau: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        System.out.println("Cau sau khi dao nguoc: " + reversedSentence.toString().trim());
        scanner.close();
    }
}
