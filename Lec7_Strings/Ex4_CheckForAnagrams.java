package Lec7_Strings;
import java.util.Arrays;
import java.util.Scanner;
public class Ex4_CheckForAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi thu nhat: ");
        String str1 = scanner.nextLine();
        System.out.print("Nhap chuoi thu hai: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("Hai chuoi la dao chu");
        } else {
            System.out.println("Hai chuoi khong phai la dao chu");
        }
        scanner.close();
    }
    public static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
