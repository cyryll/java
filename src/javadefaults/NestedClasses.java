package javadefaults;

public class NestedClasses {
    private String text = "I am private!";

    //static inner class
    public static class Nested {

    }
    //non-static inner class
    public class Inner {
        private String text = "I am inner private!";

        public void printText() {
            //local class-defined inside a methos
            class  Local {}

            //instance if local class
            Local local = new Local();

            //wil print inner text
            System.out.println(text);
            //to print NestedClasses class text use this
            System.out.println(NestedClasses.this.text);
        }
    }
    public static void main(String[] args){
        //create instance of the static inner class
        NestedClasses.Nested instance = new NestedClasses.Nested();

        //create instance of the outer class
        NestedClasses outer = new NestedClasses();
        //create instance of the non-static inner class
        NestedClasses.Inner inner = outer.new Inner();
        inner.printText();
    }
}
