package part1.iterator.a1;

import java.util.ArrayList;

import part1.iterator.a1.Aggregate;
import part1.iterator.a1.Book;
import part1.iterator.a1.BookShelfIterator;
import part1.iterator.a1.Iterator;

public class BookShelf implements Aggregate {

    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}