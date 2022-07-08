package core.collections;

public class A {
    public void foo(){
        System.out.println("foo from "+getClass().getSimpleName());
    }
    public void bar(){
        System.out.println("bar from "+getClass().getSimpleName());
    }

    public static void fooFoo(){
        System.out.println("fooFoo from A");
    }
}
