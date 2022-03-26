package collections.JavaComparable;

public class Student implements Comparable<Student> {
    int roll_no;
    String name;
    int age;

    Student(int roll_no, String name, int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student st) {
        return Integer.compare(age, st.age);
    }
}
