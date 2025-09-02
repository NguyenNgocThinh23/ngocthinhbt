package Lec7_Strings;
import java.util.Scanner;
public class Ex7_CreateAnAcronym {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot cum tu: ");
        String phrase = scanner.nextLine();
        String[] words = phrase.trim().split("\\s+");
        StringBuilder acronym = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                acronym.append(word.charAt(0));
            }
        }
        System.out.println("Tu viet tat: " + acronym.toString().toUpperCase());
        scanner.close();
    }
}
