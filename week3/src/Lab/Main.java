package Lab;

public class Main {
    public static void main(String[] args) {
        Day d = new Day(1, 1 ,2000);
        System.out.println("Date: " + d.toString());

        if (d.isNewYear()) { System.out.println(d.toString() + " is the start of a New year"); }

        if (d.isCentury()) { System.out.println(d.getYear() + " is  a Century"); }

        if (d.isLeapYear()) { System.out.println(d.getYear() + " is  a Leap year"); }

    }
}
