package javadefaults;

public class JavaEnum {
    public enum Level {
        HIGH,
        MEDIUM,
        LOW
    }
    public static void main(String[] args){
        //iterate through the list of constants
        for (Level level: Level.values()){
            System.out.println(level);
        }
        //instantiate level
        Level level = Level.LOW;


    }
}
