package collections.JavaMapInterface.JavaLinkedHashMap;

import java.util.*;

public class LHMBook {
    public static void main(String[] args) {
        //Creating map of BookLHMs
        Map<Integer,BookLHM> map=new LinkedHashMap<>();
        //Creating BookLHMs
        BookLHM b1=new BookLHM(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookLHM b2=new BookLHM(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookLHM b3=new BookLHM(103,"Operating System","Galvin","Wiley",6);
        //Adding BookLHMs to map
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        //Traversing map
        for(Map.Entry<Integer, BookLHM> entry:map.entrySet()){
            int key=entry.getKey();
            BookLHM b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
