package collections.JavaComparator.Java8Comparator;

import java.util.*;

public class Comparator1 {
    public static void main(String[] args){
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));
        al.add(new Student(106,null,28));
        //Sorting elements on the basis of name, also check for null values and place the as the first
        Comparator<Student> cm1=Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));
        al.sort(cm1);
        System.out.println("Sorting by Name and Considers null to be less than non-null");
        for(Student st: al){
            System.out.println(st.roll_no+" "+st.name+" "+st.age);
        }

        //Sorting elements on the basis of name, also check for null values and place the as the last (null> non-null)
        Comparator<Student> cm2=Comparator.comparing(Student::getName, Comparator.nullsLast(String::compareTo));
        al.sort(cm2);
        System.out.println("Sorting by Name and Considers null to be greater than non-null");
        for(Student st: al){
            System.out.println(st.roll_no+" "+st.name+" "+st.age);
        }
        //Sorting elements on the basis of age
        Comparator<Student> cm3=Comparator.comparing(Student::getAge);
        al.sort(cm3);
        System.out.println("Sorting by Age");
        for(Student st: al){
            System.out.println(st.roll_no+" "+st.name+" "+st.age);
        }
    }
}
