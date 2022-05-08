package pl.edu.pw.ee.books;

public class BookCounter {
    public static int countBooksToRead(BookShelf bookShelf){
        int maxNumOfBooks = 0;

        for (int i = 0; i < bookShelf.getNumOfBooks(); i++){
            int neededTime = 0;
            int readBooks = 0;

            for (int j = i; j >= bookShelf.getNumOfBooks(); j++){
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
