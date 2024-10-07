package week1;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = inputDevice.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = inputDevice.nextLine();

        System.out.println("Enter your age: ");
        int age = inputDevice.nextInt();

        System.out.println("Hello " + firstName + " " + lastName + ", " + age);
    }
}
