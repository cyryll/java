package collections.JavaTreeSets;
import java.util.*;

public class TreeSet1 {
    public static void main(String[] args){
        //Creating and adding elements
        TreeSet<String> al=new TreeSet<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements
        for (String s : al) {
            System.out.println(s);
        }
    }
}
