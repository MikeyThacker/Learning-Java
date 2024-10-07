package week1;

import static java.lang.Math.pow;

public class StoringNumbers {
    public static void main(String[] args) {
        // The integer data type only uses 32 bits to store numbers
        int positive = 2147483640 + 10;
        int negative = -2147483640 - 10;

        // Use long data type to store numbers using 64 bits
        long maximum = (long) pow(2, 64);
        System.out.println(maximum - 1);
        System.out.println(maximum);
        System.out.println(maximum + 1 + "\n");
        // The largest Number storable is 2 ^ 64
        // The smallest Number storable is -(2 ^64) - 1

        // As a double uses 64 bits to represent a real number, some accuracy can be lost
        double x = 10000000.0;
        double y = 333333.0 / x;
        double z = x * y;
        System.out.println(z + "\n");

        // The double data type can also be used to store infinity
        double a = Double.POSITIVE_INFINITY;
        double b = Double.NEGATIVE_INFINITY;
        System.out.println(a + 1);
        System.out.println(a + b);

    }
}
