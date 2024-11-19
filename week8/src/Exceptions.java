public class Exceptions {
    static void tryCatch() {
        // To catch any exception:
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // To catch specific exceptions
        try {
            int c = 1;
            int d = 0;
            System.out.println(c / d);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Other Exception");
        }

        // The Finally block executes whether there is an exception or not
        // Do not always need this but can help to clean up

        // Method Throws
        throwCatch();
    }

    static int throwCatch() throws ArithmeticException {
        // The throws keyword passes off the responsibility of handling the exception to the place that calls the method
        int a = 10;
        int b = 0;

        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException();
        }

    }

    public static void main(String[] args) {
        tryCatch();
    }
}
