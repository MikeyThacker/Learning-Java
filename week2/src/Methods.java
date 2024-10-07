public class Methods {
    public static void main(String[] args) {
        // Calling a method
        method();
    }

    private static void method() {// Header (Signature)
        System.out.println("Adding another method"); // Body
    }

    private static void Header() {
        // <Optional access specifier> <optional static modifier> <return type> <identifier>(<parameters>)
        // e.g.,
        // public static void
        // private double method()
        // protected int method(int num1, int num2)

        // Multiple methods can have the same identifier
        // They are differentiated by how many parameters are passed into it

        // Parameter is the name of the variables expected to be passed in
        // The arguments are the values passed into the method
        // This is called method overloading
    }

    private static void Body(String parameter) {
        // Parameters are variables passed into the method from where it is called

        // A method can end for three reasons:
        //      The method completes all its statements
        //      The method throws an exception
        //      The method reaches a return statement
    }
}
