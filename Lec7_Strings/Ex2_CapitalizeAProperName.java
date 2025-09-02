package Lec7_Strings;
import java.util.Scanner;
public class Ex2_CapitalizeAProperName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullName = scanner.nextLine();
        String trimmedName = fullName.trim();
        String[] words = trimmedName.split("\\s+");
        StringBuilder capitalizedName = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                capitalizedName.append(capitalizedWord).append(" ");
            }
        }
        System.out.println("Ten sau khi viet hoa: " + capitalizedName.toString().trim());
        scanner.close();
    }
}
