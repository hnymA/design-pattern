package part1.iterator;

//import java.util.ArrayList; // 1-1

public class BookShelf implements Aggregate {

    private Book[] books;
//    private ArrayList<Book> books; // 1-1
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
//        this.books = new ArrayList<>(maxsize); // 1-1
    }

    public Book getBookAt(int index) {
        return books[index];
//        return books.get(index); // 1-1
    }

    public void appendBook(Book book) {
        this.books[last] = book;
//        books.add(book); // 1-1
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}