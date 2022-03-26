package collections.JavaHashSets;
import java.util.*;

public class BookSet {
    public static void main(String[] args) {
        HashSet<Books> set=new HashSet<Books>();
        //Creating Books
        Books b1=new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Books b2=new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Books b3=new Books(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing HashSet
        for(Books b:set){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
