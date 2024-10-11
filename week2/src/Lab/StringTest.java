package Lab;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = s.toLowerCase();
        System.out.println("String: " + t);

        int n = s.length();
        System.out.println("Length: " + n);
    }
}
