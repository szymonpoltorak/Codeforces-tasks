package pl.edu.pw.ee.queries;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (var in = new Scanner(System.in)) {
            System.out.print("Please give me a number of test cases: ");
            int tests = in.nextInt();

            if (tests < 1){
                throw new IllegalArgumentException("How number of tests can be less than one ?");
            }

            for (int t = 0; t < tests; t++) {
                System.out.printf("%nTest[%d]:%n", t);
                System.out.print("Please enter the number of candies: ");
                int numOfCandies = in.nextInt();

                System.out.print("Please enter number of queries: ");
                int numOfQueries = in.nextInt();

                if (numOfQueries < 1 || numOfCandies < 1){
                    throw new IllegalArgumentException("Why would anyone like to have less candies and queries than 1?");
                }

                System.out.println("Please enter " + numOfCandies + " sugar quantities: ");
                var candies = new int[numOfCandies];

                for (int i = 0; i < candies.length; i++) {
                    candies[i] = in.nextInt();
                }
                QuickSort.qsortDecreasing(candies, 0, candies.length - 1);

                System.out.println("Please enter " + numOfQueries + " query quantities: ");
                var queries = new int[numOfQueries];

                for (int i = 0; i < queries.length; i++) {
                    queries[i] = in.nextInt();
                }
                Queries.solveQueries(candies, queries);
            }
        } catch (InputMismatchException exception) {
            System.err.println("Wrong input given!");
            System.exit(1);
        }
    }
}
