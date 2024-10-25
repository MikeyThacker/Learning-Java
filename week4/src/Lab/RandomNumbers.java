package Lab;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random generator = new Random();
        double d = generator.nextDouble();

        boolean[] data = new boolean[100];
        for (int i = 0; i < data.length; i++) {
            double r = generator.nextDouble();
            data[i] = (r < 0.25);
        }

        // Count through how many True values in the array
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]) {
                count++;
            }
        }

        Population p = new Population(100_000, 0.2, 0.95, 0.5);
        for (int i = 0; i < 100; i++) {
            p.update();
            System.out.println(p);
        }
    }
}
