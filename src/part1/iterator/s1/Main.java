package part1.iterator.s1;

public class Main {

    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf(4);
        bookshelf.appendBook(new Book("Around the World in 80 days"));
        bookshelf.appendBook(new Book("Bible"));
        bookshelf.appendBook(new Book("Cinderella"));
        bookshelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookshelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}