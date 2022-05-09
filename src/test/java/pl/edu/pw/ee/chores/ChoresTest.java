package pl.edu.pw.ee.chores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChoresTest {
    private Chores chores;

    @BeforeEach
    public void init_chores(){
        this.chores = new Chores(5,2,3);
    }

    @Test
    public void init_chores_exception(){
        //given
        int numOfChores = 0;
        int petyaChores = 0;
        int vasyaChores = 0;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Chores(numOfChores, petyaChores ,vasyaChores));
    }

    @Test
    public void setComplexity_exception(){
        //given
        int complexity = 0;
        int index = 1;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> chores.setComplexity(index, complexity));
    }

    @Test
    public void getNumOfWays_test_pass(){
        //given
        int expected = 3;
        chores.setComplexity(0, 6);
        chores.setComplexity(1, 2);
        chores.setComplexity(2, 3);
        chores.setComplexity(3, 100);
        chores.setComplexity(4, 1);

        //when
        int result = chores.getNumOfWays();

        //then
        Assertions.assertEquals(expected, result);
    }

}
