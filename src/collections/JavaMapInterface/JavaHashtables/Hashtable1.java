package collections.JavaMapInterface.JavaHashtables;
import java.util.*;

public class Hashtable1 {
    public static void main(String args[]){
        Hashtable<Integer,String> hm=new Hashtable<>();

        hm.put(100,"Amit");
        hm.put(102,"Ravi");
        hm.put(101,"Vijay");
        hm.put(103,"Rahul");
        System.out.println("Before remove: "+ hm);
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // Remove value for key 102
        hm.remove(102);
        System.out.println("After remove: "+ hm);
        //check if it exists
        //Here, we specify the if and else statement as arguments of the method
        System.out.println(hm.getOrDefault(111, "Not Found"));

        //Inserts, as the specified pair is unique
        hm.putIfAbsent(104,"Gaurav");
        System.out.println("Updated Map: "+hm);
        //Returns the current value, as the specified pair already exist
        hm.putIfAbsent(101,"Vijay");
        System.out.println("Updated Map: "+hm);
    }
}
