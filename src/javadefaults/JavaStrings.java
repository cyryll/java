package javadefaults;

public class JavaStrings {
    public static void main(String args[]){
        //create a string
        String name = "Peter Pan";
        String one = "Hello";

        //Concatenating Strings
        String three = one + " " + name;
        //String Concatenation Performance
        String four = new StringBuilder(one).append(name).toString();

    }
}
