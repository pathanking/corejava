package core.oop;

public class StaticDemo {
    public static String message = "hello, ";

    public static void hello() {
        message += " world! ";
        System.out.println(message); // hello word!
    }

    { //non-static or instance block; called everytime when an instance is created
        message += " Love to Learn Java!! ";
        System.out.println(message); //
    }

    static { //called before main method; at the time of class loading for the first time
        message += " I feel, Java is interesting!! ";
        System.out.println(message); //
    }

    final static public void main(String[] args) {
        StaticDemo staticDemo = new StaticDemo();
        hello();
    }
}
