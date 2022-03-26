package collections.JavaMapInterface.JavaLinkedHashMap;

import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[] args) {
        //initiate a linked hashmap
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();

        //add entries to it
        hm.put(101,"John");
        hm.put(102,"Vuli");
        hm.put(103,"Gate");

        //transverse through the map
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Return only keys
        System.out.println("Keys: " + hm.keySet());
        //to get values
        System.out.println("Values: " + hm.values());
        //to get key-value pairs
        System.out.println("Key-Value pairs: " + hm.entrySet());

        //to remove an entry
        hm.remove(102);
        System.out.println("After calling remove: " + hm);

    }
}
