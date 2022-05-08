package pl.edu.pw.ee.books;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Please give me number of books: ");
            int numOfBooks = in.nextInt();
            if (numOfBooks < 1 || numOfBooks > 100000) {
                throw new IllegalArgumentException("Number of books is not in proper range!");
            }

            BookShelf bookShelf = new BookShelf(numOfBooks);

            System.out.println("Please give me your free time : ");
            bookShelf.setFreeTime(in.nextInt());
            if (bookShelf.getFreeTime() < 1 || bookShelf.getFreeTime() > 1000000000) {
                throw new IllegalArgumentException("Free time is not in proper range!");
            }

            System.out.println("Please give me time needed for each book.");
            for (int i = 0; i < bookShelf.getNumOfBooks(); i++){
                System.out.printf("Book[%d]: ", i);
                bookShelf.setBookReadTime(i, in.nextInt());

                if (bookShelf.getBookReadTime(i) < 1 || bookShelf.getBookReadTime(i) > 10000){
                    throw new IllegalArgumentException("Wrong reading time given for book!");
                }
            }
            System.out.println("Max num of books: " + BookCounter.countBooksToRead(bookShelf));

        } catch (InputMismatchException exception) {
            System.out.println("You have not given proper value for task!");
            exception.printStackTrace();
        }
    }
}
