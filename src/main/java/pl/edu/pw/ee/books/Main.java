package pl.edu.pw.ee.books;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please give me number of books: ");
        int numOfBooks = in.nextInt();
        if (numOfBooks < 1 || numOfBooks > 100000){
            throw new IllegalArgumentException("Number of books is not in proper range!");
        }
        int[] bookReadTime = new int[numOfBooks];

        System.out.println("Please give me your free time : ");
        int freeTime = in.nextInt();
        if (freeTime < 1 || freeTime > 1000000000){
            throw new IllegalArgumentException("Free time is not in proper range!");
        }

        System.out.println("Please give me time needed for each book.");
        for (int i = 0; i < bookReadTime.length; i++){
            System.out.printf("Book[%d]: ", i);
            bookReadTime[i] = in.nextInt();
            if (bookReadTime[i] < 1 || bookReadTime[i] > 10000){
                throw new IllegalArgumentException("Wrong reading time given for book!");
            }
        }
        System.out.println("NumOfBooks : " + numOfBooks + " FreeTime: " + freeTime + " BookReadTime:\n"
                + Arrays.toString(bookReadTime));

    }
}
