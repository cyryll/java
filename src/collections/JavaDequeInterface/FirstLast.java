package collections.JavaDequeInterface;
import java.util.*;

public class FirstLast {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        //add elements to deque using offer() method and add () method
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        //ad element at the beginning of deque
        deque.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        //deque.poll();
        //Remove element at the end of deque using pollLast() method
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
    }
}
