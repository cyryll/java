package collections.JavaComparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
//        Student s1=(Student)o1;
//        Student s2=(Student)o2;

        return s1.name.compareTo(s2.name);
    }
}
