package pl.edu.pw.ee.books;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookShelfTest {
    @Test
    void setBookReadTime_test_exception(){
        //given
        var bookShelf = new BookShelf(4);

        //when

        //then
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> bookShelf.setBookReadTime(10, 10));
    }
}
