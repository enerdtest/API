package testOOPs;

import OOPs.Collections.BookArray;
import OOPs.Collections.BookHashSet;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HashSet {
    @Test
    public void getHashset(){
        java.util.HashSet<BookHashSet> hashSet = new java.util.HashSet<BookHashSet>();

       BookHashSet b1=new BookHashSet(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookHashSet b2=new BookHashSet(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookHashSet  b3=new BookHashSet(103,"Operating System","Galvin","Wiley",6);

        hashSet.add(b1);
        hashSet.add(b2);
        hashSet.add(b3);
        for(BookHashSet bs:hashSet){
            System.out.println("BookID is " + bs.bookId + " Book name is " +bs.bookName+ " Author is " +bs.author+ " Publisher is " +bs.publisher+ " quantity is " + bs.quantity+ " ");
        }
    }
    @Test
    public void getBookArray(){
        ArrayList<BookArray> aList = new ArrayList<BookArray>();
        BookArray bookArray1 = new BookArray(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookArray bookArray2 = new BookArray(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookArray bookArray3 = new BookArray(103,"Operating System","Galvin","Wiley",6);
        BookArray bookArray4 = new BookArray(104,"Operating System","Galvin Klevin","Wiley Sadly",10);

        aList.add(bookArray1);
        aList.add(bookArray2);
        aList.add(bookArray3);
        aList.add(bookArray4);
        for (BookArray arr:aList){
            System.out.println(arr.bookID + ": " +arr.bookName+" "+ arr.authorName +" " +arr.publisher+ " " + arr.quantity+ "");
        }
    }

}
