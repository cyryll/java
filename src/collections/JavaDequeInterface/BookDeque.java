package collections.JavaDequeInterface;

import java.util.*;

public class BookDeque {
    public static void main(String[] args) {
        //initialize deque
        Deque<BookD> set = new ArrayDeque<>();
        //Creat BookDs
        BookD b1 = new BookD(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookD b2 = new BookD(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        BookD b3 = new BookD(103, "Operating System", "Galvin", "Wiley", 6);

        //Add book to deque
        set.add(b1);
        set.add(b2);
        set.add(b3);

        //Traversing ArrayDeque
        for(BookD b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
