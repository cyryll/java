package javadefaults;

abstract class Names{
    abstract void getName();
}
abstract class Bank{
    abstract int getRateOfInterest();
}

//inherit from the abstract class
class FirstName extends Names {
    //use super class method getNames
    void getName(){System.out.println("John");}
}
class LastName extends Names {
    //use super class method getNames
    void getName(){System.out.println("Doe");}
}
class NBK extends Bank{
    int getRateOfInterest(){return 7;}
}
class KCB extends Bank{
    int getRateOfInterest(){return 8;}
}
public class JavaAbstarcts {
    public static void main(String[] args){
        Names jd = new FirstName();
        Names jdl = new LastName();
        Bank interest = new NBK();
        Bank interestK = new KCB();
        System.out.println( "National Bank's Interest is: "+ interest.getRateOfInterest()+" %");
        System.out.println( "KCB's Interest is: "+ interestK.getRateOfInterest()+" %");
        jd.getName();
        jdl.getName();
    }
}
