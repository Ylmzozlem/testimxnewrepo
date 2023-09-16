package Question27;

public class Book {
    private String title;
    private String author;
    private int publishedYear;

    public Book(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Published Year: " + publishedYear);
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Smith", 2020);
        book.displayInfo();
    }
}
