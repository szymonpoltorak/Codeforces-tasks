package pl.edu.pw.ee.books;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookCounterTest {
    @Test
    public void countBooksToRead_test_pass(){
        //given
        int[] booksTime = new int[]{ 2, 2 ,3 };
        BookShelf bookShelf = new BookShelf(3, booksTime);
        int expected = 1;

        //when
        int result = BookCounter.countBooksToRead(bookShelf);

        //then
        Assertions.assertEquals(expected, result);
    }
}
