package OOPs.Collections;

public class BookArray {
    public int bookID, quantity;
    public String bookName, authorName, publisher;

    public BookArray(int bookID, String bookName, String authorName, String publisher, int quantity){
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
