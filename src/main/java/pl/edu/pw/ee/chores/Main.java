package pl.edu.pw.ee.chores;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Please give me a number of chores : ");
            int numOfChores = in.nextInt();

            System.out.print("Please give me Petya's chores : ");
            int petyaChores = in.nextInt();

            System.out.print("Please give me Vasya's chores : ");
            int vasyaChores = in.nextInt();

            if (numOfChores < 2 || numOfChores > 2000 || petyaChores < 1 || vasyaChores < 1 || numOfChores != petyaChores + vasyaChores) {
                throw new IllegalArgumentException("You have given wrong arguments range!");
            }

            int[] complexity = new int[numOfChores];
            System.out.println("\nPlease give time complexity for each task");
            for (int i = 0; i < complexity.length; i++){
                System.out.printf("Complexity[%d]: ", i);
                complexity[i] = in.nextInt();

                if (complexity[i] < 1 || complexity[i] > 1000000000){
                    throw new IllegalArgumentException("You have given wrong complexity number!");
                }
            }

            Arrays.sort(complexity);
            int numOfWays = complexity[vasyaChores] - complexity[vasyaChores - 1];

            System.out.println("\nNum of ways: " + numOfWays);

        } catch (InputMismatchException exception) {
            System.err.println("Wrong arguments found!");
        }
    }
}
