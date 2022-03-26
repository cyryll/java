package collections.JavaLists;
import java.util.*;

public class ListToArray {
    public static void main(String args[]){
        //create list using array list
        List<String> fruitList = new ArrayList<>();
        //add items to list
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        //Converting ArrayList to Array
        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: "+Arrays.toString(array));
        System.out.println("Printing List: "+fruitList);

        //accessing the element
        System.out.println("Returning element: "+fruitList.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element
        fruitList.set(1,"Dates");
        //Iterating the List element using for-each loop
        for(String fruit:fruitList)
            System.out.println(fruit);

    }
}
