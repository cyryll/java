package collections.JavaTreeSets;

import java.util.*;

public class JavaNavigableSet {
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: "+set);
        //reverse the set
        System.out.println("Reverse Set: "+set.descendingSet());
        //slice set to element C inclusive
        System.out.println("Head Set: "+set.headSet("C", true));
        //returns a set from element A not inclusive to element E inclusive
        System.out.println("SubSet: "+set.subSet("A", false, "E", true));

        System.out.println("TailSet: "+set.tailSet("C", false));
    }
}
