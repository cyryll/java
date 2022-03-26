package collections.ArrayLists;

import java.util.*;

public class CompareArrayLists {
    public static void main(String[] args) {
        //first arraylist
        ArrayList<String> firstList = new ArrayList<>();
        //adds elements to the array list
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Peach");
        System.out.println(firstList);
        //second array list
        ArrayList<String> secondList = new ArrayList<>();
        //adds elements to the array list
        secondList.add("Apple");
        secondList.add("Pears");
        secondList.add("Guava");
        secondList.add("Peach");
        System.out.println(secondList);

        //comparing both lists
        boolean boolval = firstList.equals(secondList); //returns true because they are the same
        System.out.println(boolval);
        //adding another element in the second list
        secondList.add("Papaya");
        //again comparing both lists
        boolean bool = firstList.equals(secondList); //returns false because lists are not equal
        System.out.println(bool);

        //remove All method removes all elements that occur in both element 1 and 2
        secondList.removeAll(firstList);
        System.out.println(secondList);


        //RETAINS  ALL
        //first arraylist
        ArrayList<String> fList=new ArrayList<>(Arrays.asList("M", "W", "J", "K", "T"));
        System.out.println("First arraylist: ");
        System.out.println(fList);
        //second arraylist
        List<String> sList=new ArrayList<>(Arrays.asList("M", "W", "E", "K", "T"));
        System.out.println("Second arraylist: ");
        System.out.println(sList);
        //returns the common elements in both list
        sList.retainAll(fList);
        System.out.println("Common elements in both list: ");
        System.out.println(sList);

        //storing the comparison output in thirdList
        ArrayList<String> thirdList= new ArrayList<>();
        //iterator using for-each loop
        for(String tempList : fList)    //tempList is  a variable
            thirdList.add(sList.contains(tempList) ? "Yes" : "No");
        System.out.println("Elements in both add to third array" + thirdList);
    }
}
