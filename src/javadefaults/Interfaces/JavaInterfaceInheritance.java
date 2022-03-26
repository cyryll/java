package javadefaults.Interfaces;
interface Printable{
    void print();
}
//inherit an interface
interface Showable extends Printable{
    void show();
}

public class JavaInterfaceInheritance implements Showable {
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        JavaInterfaceInheritance obj = new JavaInterfaceInheritance();
        obj.print();
        obj.show();
    }
}
