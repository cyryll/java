package collections.JavaMapInterface.JavaHashMap;

import java.util.*;

public class HashMApAddElements {
    public static void main(String []args){
        HashMap<Integer,String> hm=new HashMap<>();
        System.out.println("Initial list of elements: "+hm);
        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        System.out.println("After invoking put() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        //and an element if key value are absent
        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> map=new HashMap<>();
        //add element with key 104 to map
        map.put(104,"Ravi");
        //add all entries of hm to map and transverse through and display
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //key-based removal
        map.remove(100);
        System.out.println("Updated list of elements: "+map);

        System.out.println("Updated list of elements:");
        hm.replace(102, "Gaurav2");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
