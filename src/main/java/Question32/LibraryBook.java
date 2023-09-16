package Question32;

public class LibraryBook {
    private String title;
    private String author;
    private String isbn;
    private boolean checkedOut;

    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.checkedOut = false;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Book checked out successfully");
        } else {
            System.out.println("Book is already checked out");
        }
    }

    public void returnBook() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book is not checked out");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Checked Out: " + checkedOut);
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming", "John Smith", "978-1234567890");
        book.checkOut();
        book.returnBook();
        book.displayInfo();
    }
}
