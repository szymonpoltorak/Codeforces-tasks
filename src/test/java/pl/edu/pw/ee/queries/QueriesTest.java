package pl.edu.pw.ee.queries;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueriesTest {
    @Test
    void solveQuery_test_pass(){
        //given
        var candies = new int[]{4, 3, 3, 1, 1, 4, 5, 9};
        var queries = new int[]{1, 10, 50, 14, 15, 22, 30};
        var result = new int[queries.length];
        var expected = new int[]{1, 2, -1, 2, 3, 4, 8};

        //when
        QuickSort.qsortDecreasing(candies, 0, candies.length - 1);
        for (int i = 0; i < queries.length; i++){
            result[i] = Queries.solveQuery(candies, queries, i);
        }

        //then
        Assertions.assertArrayEquals(expected, result);
    }
}
