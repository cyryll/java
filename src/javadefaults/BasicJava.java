package javadefaults;

public class BasicJava {

    public static void main(String args[]){
        //get minimum value
        int min = Math.min(10, 20);
        //round off to the nearest integer and returns as an integer
        double ceil = Math.ceil(5.4787);
        //round off to the nearest integer and returns as a double
        double floor = Math.floor(5.4787);
        //round off to the nearest integer and returns as a double
        double rnd = Math.round(5.4787);
        //get absolute value
        int abs1 = Math.abs(-10);
        System.out.println("get absolute value:" + abs1);
        System.out.println("get nearest integer value as an double:" + ceil);
        System.out.println("get nearest integer value as a double:" + floor);
        System.out.println("get nearest integer value as a double(round):" + rnd);
        System.out.println("minimum value:" + min);
        System.out.println("awesome");
    }
}
