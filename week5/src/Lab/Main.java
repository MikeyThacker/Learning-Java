package Lab;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Chromosome x = new Chromosome(10, new Random());
        System.out.println(x.toString());

        x.Mutate();
        System.out.println(x.toString() + "\n");

        Chromosome y = x.copy();
        System.out.println(x.toString());
        System.out.println(y.toString());

        System.out.println(x.fitness());
    }
}
