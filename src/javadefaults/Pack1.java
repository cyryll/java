package javadefaults;

//import a class from different package

import test_package.Etra;

public class Pack1 {
    //private access modifier accessed using accessor methods(getters and setters)
    private int phone_no = 0;
    private  String name;

    //constructor with private access modifier
    private Pack1(String theName) {
        this.name = theName;
    }
    public Pack1(String theName, String location) {
        //call the private constructor
        this(theName);
        this.name += location;
    }
    //Getter method
    public int getPhoneNumber() {
        return this.phone_no;
    }

    //setter method
    public void setPhoneNo(int setPhone){
        this.phone_no = setPhone;
    }
    public static void main(String[] args) {
        //access the class by initializing it
        Etra eT = new Etra();
        //use the class's methods here
        eT.showInBasic();
    }
}
