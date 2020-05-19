public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static void main(String[] args) {
        Book book = new Book("Mickiewicz", "Dziady");

    }

    public static String of(String author, String title) {
        Book book = Book.of(String author, String title);
        return book;

    }
}
