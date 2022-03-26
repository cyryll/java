package javadefaults;

public class JavaArrays {

    public static void main(String args[]){

        //ID array
        String[] stringArray = new String[10];

        for(int i=0; i < stringArray.length; i++) {
            stringArray[i] = "String no " + i;
        }

        for (String s : stringArray) {
            System.out.println(s);
        }
        //2D array
        int[][] intArray = new int[10][20];
        //iterate through the array
        for(int i=0; i < intArray.length; i++){
            for(int j=0; j < intArray[i].length; j++){
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        //insert elements in an array



    }
}
