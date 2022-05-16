package pl.edu.pw.ee.queries;

import org.jetbrains.annotations.NotNull;

public class Queries {
    private Queries(){}

    public static void solveQueries(int[] candies, int @NotNull [] queries){
        for (int i = 0; i < queries.length; i++){
            var sum = 0;
            var number = 0;

            for (int candy : candies) {
                sum += candy;
                number++;

                if (queries[i] <= sum) {
                    System.out.printf("Number of candies for queries[%d]: %d%n", i, number);
                    break;
                }
            }
            if (sum < queries[i]){
                System.out.printf("Number of candies for queries[%d]: -1%n", i);
            }
        }
    }
}
