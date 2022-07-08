package core.oop.abstraction;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void foo() {
        System.out.println("foo from "+ getClass().getSimpleName());
    }
}
class InterfaceTest{
    public static void main(String[] args) {
        MyInterface object = new MyInterfaceImpl();
        object.foo();
        //object.bar("hello java!!");
        MyInterface.fooBar();
    }
}
