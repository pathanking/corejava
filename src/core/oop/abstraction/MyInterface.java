package core.oop.abstraction;

public interface MyInterface {
    void foo();

    default void bar(String message) {
        System.out.println(message);
    }

    static void fooBar()  {
        process();
        System.out.println("Greetings from MyInterface!!");
    }

    private static void process()  {
        System.out.println("processing");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
