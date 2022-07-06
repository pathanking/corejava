package core.oop;

public class Demo {
    private static Demo demo = null;

    private Demo(){}

    public static Demo getDemo(){
        if(demo == null)
            demo = new Demo();
        return demo;
    }

    public static void foo(){
        System.out.println("from from Demo!!");
    }
}

class DemoTest{
    public static void main(String[] args) {
        Demo.foo();
    }
}
