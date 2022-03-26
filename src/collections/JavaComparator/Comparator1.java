package collections.JavaComparator;
import java.util.*;
import java.io.*;

public class Comparator1 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

//        System.out.println("Default list");
//        for(Object m:al)
//            System.out.println(m);

        //Sort by name
        System.out.println("Sorting by Name");

        Collections.sort(al, new NameComparator());
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.roll_no + " " + st.name + " " + st.age);
        }

        //sort by age
        System.out.println("Sorting by age");

        Collections.sort(al, new AgeComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.roll_no + " " + st.name + " " + st.age);
        }
    }
    }
