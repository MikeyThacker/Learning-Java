package week1;

import java.time.Period;
import java.util.Scanner;

public class PeriodParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Example:");
        String time = "P21Y3M4D";
        printTime(time);


        System.out.println("My turn:");

        String years;
        String months;
        String days;

        System.out.print("Enter number of years: ");
        years = scanner.nextLine();
        System.out.print("Enter number of months: ");
        months = scanner.nextLine();
        System.out.print("Enter number of days: ");
        days = scanner.nextLine();

        time = "p" + years + "Y" + months + "M" + days + "D";
        printTime(time);
    }

    public static void printTime(String time) {

        // Converting strings into period value using parse() method
        Period p = Period.parse(time);
        System.out.println("The time is: ");
        System.out.println("    "+ p.getYears() + " Years \n"
                + "    " + p.getMonths() + " Months \n"
                + "    " + p.getDays() + " Days \n");
    }
}
