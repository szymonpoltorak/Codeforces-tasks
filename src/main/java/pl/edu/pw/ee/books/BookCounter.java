package pl.edu.pw.ee.books;

import org.jetbrains.annotations.NotNull;

public class BookCounter {
    private BookCounter(){}

    public static int countBooksToRead(@NotNull BookShelf bookShelf){
        var maxNumOfBooks = 0;

        for (int i = 0; i < bookShelf.getNumOfBooks(); i++){
            var neededTime = 0;
            var readBooks = 0;

            for (int j = i; j < bookShelf.getNumOfBooks(); j++){
                neededTime += bookShelf.getBookReadTime(j);

                if (neededTime <= bookShelf.getFreeTime()){
                    readBooks++;
                }
                else {
                    break;
                }
            }
            maxNumOfBooks = Math.max(maxNumOfBooks, readBooks);
        }

        return maxNumOfBooks;
    }
}
