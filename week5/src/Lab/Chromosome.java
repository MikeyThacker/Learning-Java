package Lab;

import java.util.Random;

public class Chromosome {
    private int size;
    private boolean[] genes;
    private Random random;

    public Chromosome(int size, Random random) {
        this.size = size;
        this.random = random;
        this.genes = new boolean[size];

        for (int i = 0; i < size; i++) {
            genes[i] = random.nextBoolean();
        }
    }

    public String toString() {
        String newString = "";
        for (int i = 0; i < genes.length; i++) {
            if (genes[i]) {
                newString += "1";
            } else {
                newString += "0";
            }
        }
        return newString;
    }

    public void Mutate() {
        int geneToChange = random.nextInt(size);
        if (genes[geneToChange]) {
            genes[geneToChange] = false;
        } else {
            genes[geneToChange] = true;
        }
    }

    public Chromosome copy() {
        Chromosome y = new Chromosome(size, random);
        y.setGenes(this.genes);
        return y;
    }

    private void setGenes(boolean[] genes) {
        this.genes = genes;
    }

    public int fitness() {
        int fitness = 0;
        for (int i = 0; i < genes.length; i++) {
            if (genes[i]) {
                fitness++;
            }
        }
        return fitness;
    }

}
