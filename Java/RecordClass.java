package Java;

public class RecordClass {

    static record Book(String title, String author, double price) {
    }

    public static void main(String[] args) {

        Book book = new Book("Clean Code", "Robert C. Martin", 45.55);

        System.out.println(book);
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: " + book.price);
    }
}
