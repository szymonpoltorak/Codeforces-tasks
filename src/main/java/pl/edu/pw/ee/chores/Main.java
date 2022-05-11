package pl.edu.pw.ee.chores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws InputMismatchException {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Please give me a number of chores : ");
            int numOfChores = in.nextInt();

            System.out.print("Please give me Petya's chores : ");
            int petyaChores = in.nextInt();

            System.out.print("Please give me Vasya's chores : ");
            int vasyaChores = in.nextInt();

            Chores chores = new Chores(numOfChores, petyaChores, vasyaChores);

            System.out.println("\nPlease give time complexity for each task");
            for (int i = 0; i < chores.getNumOfChores(); i++){
                System.out.printf("Complexity[%d]: ", i);
                chores.setComplexity(i, in.nextInt());
            }

            System.out.println("\nNum of ways: " + chores.getNumOfWays());

        } catch (InputMismatchException exception) {
            System.err.println("Wrong arguments found!");
        }
    }
}
