package week1;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = inputDevice.nextInt();

        System.out.print("Enter another integer: ");
        int num2 = inputDevice.nextInt();

        int sum = num1 + num2;
        int difference = abs(num2 - num1);
        int product = num1 * num2;
        float quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

    }
}
