package Lec6_Arrays_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Ex15_ConvertBetweenArrayAndArrayList {
    public static ArrayList<String> arrayToArrayList(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String item : arr) {
            list.add(item);
        }
        return list;
    }
    public static String[] arrayListToArray(ArrayList<String> list) {
        return list.toArray(new String[0]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array to ArrayList
        System.out.print("Enter number of elements for array: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] strArray = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strArray[i] = scanner.nextLine();
        }
        ArrayList<String> arrayList = arrayToArrayList(strArray);
        System.out.println("Converted ArrayList: " + arrayList);
        // ArrayList to Array
        System.out.print("Enter number of elements for ArrayList: ");
        int m = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> strList = new ArrayList<>();
        System.out.println("Enter " + m + " strings:");
        for (int i = 0; i < m; i++) {
            strList.add(scanner.nextLine());
        }
        String[] newArray = arrayListToArray(strList);
        System.out.println("Converted Array: " + Arrays.toString(newArray));
        scanner.close();
    }
}
