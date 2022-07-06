package core.pack1;

import java.io.Console;

public class M {

    private M(){
        System.out.println("from M()!");
    }

    void show(){
        System.out.println("show!");
    }
}
class MDemo{
    public static void main(String[] args) {
        Console console =  System.console();
        String greetings =  console.readLine("Enter Greetings message : ");
        System.out.println("Message : "+ greetings);
//        System.exit(0);
    }
}
