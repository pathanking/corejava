package core.oop;

public  class MyAbstractImpl extends MyAbstract {
    public MyAbstractImpl(int k, String m) {
        super(k, m);
    }

    @Override
    public void foo() {
        System.out.println("foo from "+getClass().getSimpleName());
    }

    public void fooBar(){
        System.out.println("fooBar from "+getClass().getSimpleName());
    }
}

class AbstractTest{
    public static void main(String[] args) {
        //superclass reference refers to child-class object : LSP from SOLID principles
        MyAbstractImpl impl = new MyAbstractImpl(10, "10");
        MyAbstractImpl2 impl2 = new MyAbstractImpl2(20, "20");

        MyAbstract object = impl2;
        object.foo();
        object.bar();

        System.out.println(object.getK()+"\t"+object.getM());
    }
}
