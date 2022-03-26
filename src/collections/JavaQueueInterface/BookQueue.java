package collections.JavaQueueInterface;

import java.util.*;

public class BookQueue {

    public static void main(String[] args) {
        Queue<BookQ> queue= new PriorityQueue<>();
        //Creating BookQs
        BookQ b1=new BookQ(121,"Let us C","Yashwant Kanetkar","BPB",8);
        BookQ b2=new BookQ(233,"Operating System","Galvin","Wiley",6);
        BookQ b3=new BookQ(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding BookQs to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for(BookQ b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        queue.remove();
        System.out.println("After removing one BookQ record:");
        for(BookQ b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
