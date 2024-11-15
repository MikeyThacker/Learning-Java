public class Arrays {
    void declaration() {
        // Instead of:
        String student1 = "John";
        String student2 = "Ahmed";
        String student3 = "Chen";
        String student4 = "Sarah";

        // Make an array of students:
        String[] students = new String[5];
        // Or for a string of doubles:
        double[] studentScores = new double[5];
        // The number in the brackets is the number of memory
        //  spaces allocated for items to store in the array
        // You can also define the array with items in it already:
        String[] Students = {"John", "Ahmed", "Chen", "Sarah"};
        double[] StudentScores = {1.2, 4.3, 1.9, 2.8, 3.0};

        // Arrays have a fixed size
    }

    void callingArrays(){
        /*
        Call an array in the same way:

        <array>[<index>]
         */
    }

    void arraysAndMethods() {
        /*
        Arrays can pass between methods as only the "pointer" is passed into the method
         */
    }

    void sorting() {
        /*
        Arrays can be sorted:
        Arrays.sort(<array>)
        Using the "Arrays" built-in class
         */
    }

    void dimensions() {
        /*
        Arrays can be twp dimensional as well:
        array = [[1,2], [3,4], [5,6]];
        String[][] map = new String[5][5];
         */
    }

    public static void main(String[] args) {
        String[] chars = new String[5];
        chars[0] = "i";
    }
}
