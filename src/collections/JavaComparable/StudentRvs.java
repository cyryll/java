package collections.JavaComparable;

public class StudentRvs implements Comparable<StudentRvs>{
    int roll_no;
    String name;
    int age;
    StudentRvs(int roll_no,String name,int age){
        this.roll_no=roll_no;
        this.name=name;
        this.age=age;
    }

    public int compareTo(StudentRvs st){
        if(age==st.age)
            return 0;
        else if(age<st.age)
            return 1;
        else
            return -1;
    }
}
