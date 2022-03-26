package collections.JavaMapInterface;

import java.util.*;

public class MapEntryExample {
    public static void main(String[] args){
        //initialize a map using map and HashMap/LinkedHashmap/TreeMap
        Map<Integer,String> map=new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        //use entrySet() to convert map to a set
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
