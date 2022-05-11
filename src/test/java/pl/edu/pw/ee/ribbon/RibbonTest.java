package pl.edu.pw.ee.ribbon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RibbonTest {
    private Ribbon ribbon;

    @BeforeEach
    public void init_ribbon(){
        ribbon = new Ribbon(5);
    }

    @Test
    void init_ribbon_exception(){
        //given
        var totalLength = -1;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Ribbon(totalLength));
    }

    @Test
    void setPieces_illegal_argument_exception(){
        //given
        var piece = -1;
        var index = 0;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> ribbon.setPieces(index, piece));
    }

    @Test
    void setPieces_array_out_bonds_exception(){
        //given
        var piece = -1;
        var index = 0;

        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> ribbon.setPieces(index, piece));
    }

    @Test
    void countMaxNumber_test_pass(){
        //given
        var expected = 2;

        ribbon.setPieces(0, 5);
        ribbon.setPieces(1, 3);
        ribbon.setPieces(2, 2);

        //when
        var result = ribbon.countMaxNumber();

        //then
        Assertions.assertEquals(expected, result);
    }
}
