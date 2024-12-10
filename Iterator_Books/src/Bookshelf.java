import java.util.ArrayList;
import java.util.List;

public class Bookshelf implements Collection {

    private List<String> books = new ArrayList<String>();

    public void add(String book) {
        books.add(book);
    }


    @Override
    public Iterator createIterator() {
        return new BooksIterator(books);
    }
}
