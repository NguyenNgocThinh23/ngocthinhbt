package Lec7_Strings;
import java.util.Scanner;
public class Ex5_ParseDataFromAURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot URL: ");
        String url = scanner.nextLine();
        String protocol = "";
        String domain = "";
        String path = "";
        int protocolEndIndex = url.indexOf("://");
        if (protocolEndIndex != -1) {
            protocol = url.substring(0, protocolEndIndex);
            int domainStartIndex = protocolEndIndex + 3;
            int pathStartIndex = url.indexOf("/", domainStartIndex);
            if (pathStartIndex != -1) {
                domain = url.substring(domainStartIndex, pathStartIndex);
                path = url.substring(pathStartIndex);
            } else {
                domain = url.substring(domainStartIndex);
                path = "/";
            }
        } else {
            System.out.println("URL khong hop le hoac khong co giao thuc");
        }
        if (!protocol.isEmpty()) {
            System.out.println("Protocol: " + protocol);
            System.out.println("Domain: " + domain);
            System.out.println("Path: " + path);
        }
        scanner.close();
    }
}
