package collections.JavaQueueInterface;

import java.util.*;

public class JavaPriorityQueue {
    public static void main(String[] args){
        //initialize priority queue
        PriorityQueue<String> queue=new PriorityQueue<>();
        //add items to the queue
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        for (String value : queue) {
            System.out.println(value);
        }
        //remove the first element
        queue.remove();
        //remove the second element
        queue.poll();
        System.out.println("after removing two elements:");
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
