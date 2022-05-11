package pl.edu.pw.ee.chores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChoresTest {
    private Chores chores;

    @BeforeEach
    public void init_chores(){
        this.chores = new Chores(5,2,3);
    }

    @Test
    void init_chores_exception(){
        //given
        var numOfChores = 0;
        var petyaChores = 0;
        var vasyaChores = 0;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Chores(numOfChores, petyaChores ,vasyaChores));
    }

    @Test
    void setComplexity_exception(){
        //given
        var complexity = 0;
        var index = 1;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> chores.setComplexity(index, complexity));
    }

    @Test
    void getNumOfWays_test_pass(){
        //given
        var expected = 3;
        chores.setComplexity(0, 6);
        chores.setComplexity(1, 2);
        chores.setComplexity(2, 3);
        chores.setComplexity(3, 100);
        chores.setComplexity(4, 1);

        //when
        var result = chores.getNumOfWays();

        //then
        Assertions.assertEquals(expected, result);
    }

}
