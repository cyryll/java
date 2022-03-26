package collections.JavaComparable;

import java.util.*;

public class StudentSort {
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        //sort in ascending order
        System.out.println("Sort array in ascending order");
        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.roll_no+" "+st.name+" "+st.age);
        }

        //sort in descending order
        ArrayList<StudentRvs> alr = new ArrayList<>();
        alr.add(new StudentRvs(101, "Vijay", 23));
        alr.add(new StudentRvs(106, "Ajay", 27));
        alr.add(new StudentRvs(105, "Jai", 21));

        System.out.println("Sort array in descending order");
        Collections.sort(alr);
        for (StudentRvs str : alr) {
            System.out.println(str.roll_no + " " + str.name + " " + str.age);
        }
    }
}
