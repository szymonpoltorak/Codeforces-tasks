package pl.edu.pw.ee.chores;

import java.util.Arrays;

public class Chores {
    private final int numOfChores;
    private final int petyaChores;
    private final int vasyaChores;
    private final int[] complexity;

    public Chores(int numOfChores, int petyaChores, int vasyaChores){
        this.numOfChores = numOfChores;
        this.petyaChores = petyaChores;
        this.vasyaChores = vasyaChores;

        if (numOfChores < 2 || numOfChores > 2000 || petyaChores < 1 || vasyaChores < 1 || numOfChores != petyaChores + vasyaChores) {
            throw new IllegalArgumentException("You have given wrong arguments range!");
        }
        this.complexity = new int[numOfChores];
    }

    public int getNumOfChores() {
        return numOfChores;
    }

    public int getPetyaChores() {
        return petyaChores;
    }

    public int getVasyaChores() {
        return vasyaChores;
    }

    public int getNumOfWays(){
        Arrays.sort(complexity);
        return complexity[vasyaChores] - complexity[vasyaChores - 1];
    }

    public void setComplexity(int index, int complexity){
        if (complexity < 1 || complexity > 1000000000){
            throw new IllegalArgumentException("You have given wrong complexity number!");
        }

        this.complexity[index] = complexity;
    }

    @Override
    public String toString(){
        return "Petya Chores: " + petyaChores + ",\n" + "Vasya Chores: " + ",\n" + "Complexities: \n"
                + Arrays.toString(complexity);
    }
}
