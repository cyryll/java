package collections.JavaMapInterface.JavaTreeMap;

import java.util.*;
public class TMBook {
    public static void main(String[] args) {
        //Creating map of BookTMs
        Map<Integer,BookTM> map=new TreeMap<Integer,BookTM>();
        //Creating BookTMs
        BookTM b1=new BookTM(101,"Let us C","Yashwant Kanetkar","BPB",8);
        BookTM b2=new BookTM(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        BookTM b3=new BookTM(103,"Operating System","Galvin","Wiley",6);
        //Adding BookTMs to map
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);

        //Traversing map
        for(Map.Entry<Integer, BookTM> entry:map.entrySet()){
            int key=entry.getKey();
            BookTM b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
