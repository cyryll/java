package collections.JavaTreeSets;

import java.util.*;

public class BookTreeSet {
    public static void main(String[] args) {
        Set<BookTs> set= new TreeSet<>();
        //Creating BookTss
        BookTs b1=new BookTs(121,"Let us C","Yashwant Kanetkar","BPB",8);
        BookTs b2=new BookTs(233,"Operating System","Galvin","Wiley",6);
        BookTs b3=new BookTs(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding BookTss to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing TreeSet
        for(BookTs b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
