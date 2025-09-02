package Lec7_Strings;
import java.util.Scanner;
public class Ex10_FindTheLongestCommonSubstring {
    public static String findLCS(String str1, String str2) {
        String longestCommon = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(i, j);
                if (str2.contains(substring) && substring.length() > longestCommon.length()) {
                    longestCommon = substring;
                }
            }
        }
        return longestCommon;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi thu nhat: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhap chuoi thu hai: ");
        String s2 = scanner.nextLine();
        String lcs = findLCS(s1, s2);
        if (lcs.isEmpty()) {
            System.out.println("Khong co chuoi con chung");
        } else {
            System.out.println("Chuoi con chung dai nhat la: " + lcs);
        }
        scanner.close();
    }
}
