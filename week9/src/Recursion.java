public class Recursion {
    public static void p(int t) {
        if (t == 0) {
            // Base case, stops the program running indefinitely
            return;
        } else {
            System.out.println("Hello");
            p(t - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            // Base case
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static long fibonacci(int index) {
        return (index == 1 || index == 2) ? 1 :
                fibonacci(index - 1) + fibonacci(index - 2);
    }

    public static void main(String[] args) {
        // Print the word 'hello' t times
        p(10);

        // Print the factorial of n using recursion
        System.out.println(factorial(5));

        // Prints nth fibonacci number using recursion
        System.out.println(fibonacci(10));

        /*
        When n is small, the difference between iteration and recursion is minimal,
        However, as n gets bigger, it is better to use iteration

        Iteration:
            A loop that terminates when the condition fails
            Faster and uses less memory than recursion as does not generate multiple stacks
            Makes code longer
        Recursion:
            Terminates when a base case is reached
            Normally slower and uses more memory due to stack
            Makes code more compact


        When recursion is necessary, use tail-recursion
            Tail recursion is where the recursive call is the last operation executed by the function
         */
    }
}
