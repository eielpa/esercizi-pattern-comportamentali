public class Main {
    public static void main(String[] args) {

        Bookshelf bookshelf = new Bookshelf();

        bookshelf.add("Lord of the Rings");
        bookshelf.add("1984");
        bookshelf.add("The Godfather");

        Iterator booksIterator= bookshelf.createIterator();

        System.out.println("Books in my bookshelf:");
        while(booksIterator.hasNext()) {
            System.out.println("- "+ booksIterator.getNext());
        }

    }
}