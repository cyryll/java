package collections.ArrayLists;

import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        System.out.println("iteration using Iterator");
        //Creating arraylist
        ArrayList<String> list = new ArrayList<String>();
        //Adding object in arraylist
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //iterate through the list
        Iterator itr = list.iterator();//getting the Iterator

        //check if iterator has the elements
        while (itr.hasNext()) {
            System.out.println(itr.next());//printing the element and move to next
        }

        System.out.println("iteration using for-each loop");
        //fetch/get second item
        System.out.println("Returning 2nd element: " + list.get(1));
        //set second item
        list.set(1, "nanasi");
        //iteration using for-each loop
        for (String fruit : list)
            System.out.println(fruit);


        //Sorting the list
        System.out.println("Sorting the list");
        Collections.sort(list);
        //Traversing list through the for-each loop
        for (String fruit : list)
            System.out.println(fruit);

        //Sorting the list
        System.out.println("Sorting numbers.........");
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for (Integer number : list2)
            System.out.println(number);

    }
}
