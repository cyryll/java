package Iterators;
import collections.JavaLists.ListIteratorJava;

import java.util.*;

public class JavaIterator {
    public static void main(String[] args){
        //Creating arraylist
        ArrayList<String> list = new ArrayList<>();
        //Add objects to the list
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        //Traversing list through List Iterator
        System.out.println("Traversing list through List Iterator in reverse:");
        //Here, element iterates in reverse order
        ListIterator<String> lst = list.listIterator(list.size());
        while(lst.hasPrevious()) {
            String str=lst.previous();
            System.out.println(str);
        }

        //Traversing list through for loop
        System.out.println("Traversing list through for loop:");
        for (String s : list) {
            System.out.println(s);
        }

        //Traversing list through forEach() method
        System.out.println("Traversing list through forEach() method:");
        //The forEach() method is a new feature, introduced in Java 8.
        //Here, we are using lambda expression
        list.forEach(System.out::println);

        //Traversing list through forEachRemaining() method
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr=list.iterator();
        //Here, we are using lambda expression
        itr.forEachRemaining(System.out::println);
    }
}
