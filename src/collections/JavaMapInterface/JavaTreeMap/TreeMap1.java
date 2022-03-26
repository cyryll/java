package collections.JavaMapInterface.JavaTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1,"Dead");
        map.put(2,"Shoot");
        map.put(3,"Pool");
        map.put(4,"Aye");
        map.put(5,"Aye");
        System.out.println("Before invoking remove() method");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("After invoking remove() method");
        map.remove(4);
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //Maintains descending order
        System.out.println("descendingMap: "+map.descendingMap());

        //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("headMap: "+map.headMap(2,true));

        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(2,true));


        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: "+map.headMap(2));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(2));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map.subMap(1, 2));
    }
}
