public class Static {
    int value;
    public void printValue() {
        System.out.println("" + value);
    }

    public static void main(String[] args) {
        // Non-Static methods can exist in java but can only be called through an instance of the class
        // The printValue method cannot be called from the main class directly, it has to be done through an object:
        Static o = new Static();
        o.printValue();
    }
}
