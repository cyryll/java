package collections.JavaMapInterface.JavaHashtables;

import java.util.*;

public class HTBook {
    public static void main(String[] args) {
        //Creating map of BookHTs
        Map<Integer,BookHT> map=new Hashtable<Integer,BookHT>();
        //Creating BookHTs
        BookHT b1=new BookHT(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookHT b2=new BookHT(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookHT b3=new BookHT(103,"Operating System","Galvin","Wiley",6);
        //Adding BookHTs to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        //Traversing map
        for(Map.Entry<Integer, BookHT> entry:map.entrySet()){
            int key=entry.getKey();
            BookHT b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
