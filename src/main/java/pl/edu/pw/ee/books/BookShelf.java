package pl.edu.pw.ee.books;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BookShelf {
    private int freeTime;
    private final int[] bookReadTime;

    public BookShelf(int freeTime, int[] bookReadTime){
        this.bookReadTime = bookReadTime;
        this.freeTime = freeTime;
    }

    public BookShelf(int numOfBooks){
        this.freeTime = 0;
        this.bookReadTime = new int[numOfBooks];
        Arrays.fill(bookReadTime, -1);
    }

    public void setFreeTime(int freeTime){
        this.freeTime = freeTime;
    }

    public void setBookReadTime(int index, int readTime){
        if (index >= bookReadTime.length){
            throw new ArrayIndexOutOfBoundsException("Given index is over the length of the array!");
        }
        this.bookReadTime[index] = readTime;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public int getBookReadTime(int index){
        return bookReadTime[index];
    }

    public int getNumOfBooks(){
        return bookReadTime.length;
    }

    @Override
    public String toString(){
        return "FreeTime: " + freeTime + " NumberOfBooks: " + bookReadTime.length
                + "\n BooksReadingTime: " + Arrays.toString(bookReadTime);
    }
}
