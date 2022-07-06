package core.oop;

public class MyAbstractImpl2 extends MyAbstract {
    public MyAbstractImpl2(int k, String m) {
        super(k, m);
    }

    @Override
    public void foo() {
        System.out.println("foo from "+getClass().getSimpleName());
    }
}
