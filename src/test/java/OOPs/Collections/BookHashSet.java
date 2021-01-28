package OOPs.Collections;

public class BookHashSet {
    public int bookId, quantity;
    public String bookName, author, publisher;
    public BookHashSet(int bookId, String bookName, String author, String publisher, int quantity){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
