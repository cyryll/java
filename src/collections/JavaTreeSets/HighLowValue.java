package collections.JavaTreeSets;

import java.util.*;

public class HighLowValue {
    public static void main(String [] args){
        TreeSet<Integer> set=new TreeSet<>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Highest Value: "+set.pollFirst());
        System.out.println("Lowest Value: "+set.pollLast());
    }
}
