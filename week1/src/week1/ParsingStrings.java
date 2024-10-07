package week1;
import java.util.Scanner;

public class ParsingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        // Take the user input as a string:
        String myAge = scanner.nextLine();

        // Convert it to an integer using Integer.parseInt():
        int age1 = Integer.parseInt(myAge);

        System.out.println("You are " + age1 + ".");

        // The same can be done with a double:
        double age2 = Double.parseDouble(myAge);
        System.out.println("You are " + age2 + ".");
    }

}
