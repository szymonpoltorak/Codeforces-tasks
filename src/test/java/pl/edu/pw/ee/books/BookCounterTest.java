package pl.edu.pw.ee.books;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookCounterTest {
    @Test
    void countBooksToRead_test_pass(){
        //given
        var booksTime = new int[]{ 2, 2 ,3 };
        var bookShelf = new BookShelf(3, booksTime);
        int expected = 1;

        //when
        int result = BookCounter.countBooksToRead(bookShelf);

        //then
        Assertions.assertEquals(expected, result);
    }
}
