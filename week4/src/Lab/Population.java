package Lab;

import java.util.Random;

public class Population {
    private int populationSize;
    private boolean[] infected;
    private double probabilityInfected;
    private double recoverChance;
    private double transmitChance;
    private Random rand;

    public Population(int populationSize, double probabilityInfected, double recoverChance, double transmitChance) {
        this.populationSize = populationSize;
        this.infected = new boolean[populationSize];
        this.probabilityInfected = probabilityInfected;
        this.recoverChance = recoverChance;
        this.transmitChance = transmitChance;
        this.rand = new Random();

        for (int i = 0; i < populationSize; i++) {
            infected[i] = (rand.nextDouble() < this.probabilityInfected);
        }
    }

    public int getInfections(){
        int count = 0;
        for (int i = 0; i < populationSize; i++) {
            if (infected[i]) {
                count ++;
            }
        }
        return count;
    }

    public String toString() {
        return getInfections() + " people are infected.";
    }


    public void update() {
        for (int i = 0; i < populationSize; i++) {
            if (infected[i]) {
                infected[i] = (rand.nextDouble() < transmitChance);
            } else {
                infected[i] = (rand.nextDouble() < recoverChance);
            }
        }
    }
}
