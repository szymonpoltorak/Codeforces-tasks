package pl.edu.pw.ee.chores;

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

            System.out.println("Please give me Vasya's chores : ");
            int vasyaChores = in.nextInt();

            if (numOfChores < 2 || numOfChores > 2000 || petyaChores < 1 || vasyaChores < 1 || numOfChores != petyaChores + vasyaChores) {
                throw new IllegalArgumentException("You have given wrong arguments range!");
            }

            int[] complexity = new int[numOfChores];
            System.out.println("Please give time complexity for each task\n");
            for (int i = 0; i < complexity.length; i++){
                System.out.printf("Complexity[%d]: ", i);
                complexity[i] = in.nextInt();
            }

            

        } catch (InputMismatchException exception) {
            System.err.println("Wrong arguments found!");
        }
    }
}
