package pl.edu.pw.ee.books;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookShelfTest {
    @Test
    public void setBookReadTime_test_exception(){
        //given
        BookShelf bookShelf = new BookShelf(4);

        //when

        //then
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> bookShelf.setBookReadTime(10, 10));
    }
}
