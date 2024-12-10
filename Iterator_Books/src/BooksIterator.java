import java.util.List;

public class BooksIterator implements Iterator{

    private List<String> books;
    private int position=0;

    public BooksIterator(List<String> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position<books.size();
    }

    @Override
    public String getNext() {
        if(hasNext()){
            return books.get(position++);
        }
        return null;
    }
}
