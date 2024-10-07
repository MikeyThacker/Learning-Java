package week1;

public class DeclaringVariables {
    public static void main(String[] args) {
        // Variables can be assigned values during or after declaration
        int num1;
        int num2 = 1;

        String word = "text";

        final String constant = "A variable that cannot be changed";

        // Primitive Data Types
        byte byte1; // Any 8-bit number
        short short1;
        int int1;
        long long1;
        float float1; // Used for decimal numbers
        double double1; // More commonly used for currencies
        boolean bool1; // True or false
        char char1; // A single character
        // A string is not a primitive data type, it's a built-in class. Recognisable by the capital "S" at declaration
    }

    public static void arithmetic() {
        int x = 10;
        int y = 20;
        int answer;

        answer = x + y;
        answer = x - y;
        answer = x * y;
        answer = x / y; // As answer is an integer, it will truncate 0.5 to 0 in this case.
        answer = x % y; // Modulus

        /* Order of precedence. Operations in the same row will execute from left to right.
        * 1st, *, /, and %
        * 2nd, + and -
        * Brackets can be used in Java to specify order
        */
    }

    public static void typeConversion() {
        float x = 10;
        float y = 20;
        // Explicit
        int z = (int) x;

        // Implicit
        int a = 10;
        double b = 20;
        double c = a + b;

        // String to integer
        String A = "10";
        String B = "20";


    }
}