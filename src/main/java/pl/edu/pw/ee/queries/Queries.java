package pl.edu.pw.ee.queries;

import org.jetbrains.annotations.NotNull;

public class Queries {
    private Queries(){}

    public static int solveQuery(int @NotNull [] candies, int @NotNull [] queries, int index){
        var sum = 0;
        var number = 0;

        for (int candy : candies) {
            sum += candy;
            number++;

            if (queries[index] <= sum) {
                return number;
            }
        }
        if (sum < queries[index]){
            return -1;
        }

        throw new IllegalStateException("Nothing to be done here.");
    }
}
