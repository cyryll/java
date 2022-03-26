package collections.JavaMapInterface.JavaHashMap;

import java.util.*;
public class HashMapBook {
    public static void main(String[] args) {
        //Creating map of BookHMs
        Map<Integer, BookHM> map=new HashMap<>();
        //Creating BookHMs
        BookHM b1=new BookHM(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookHM b2=new BookHM(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookHM b3=new BookHM(103,"Operating System","Galvin","Wiley",6);
        //Adding BookHMs to map
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);

        //Traversing map
        for(Map.Entry<Integer, BookHM> entry:map.entrySet()){
            int key=entry.getKey();
            BookHM b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
