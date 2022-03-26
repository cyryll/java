package collections.JavaHashSets;
import java.util.*;

public class HashSetFromDuffCollection {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        HashSet set=new HashSet(list);
        set.add("Gaurav");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
