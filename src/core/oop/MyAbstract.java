package core.oop;

public abstract class MyAbstract {
    private int k;
    private String m;

    public MyAbstract(int k, String m) {
        this.k = k;
        this.m = m;
    }

    public int getK() {
        return k;
    }

    public String getM() {
        return m;
    }

    public abstract void foo();

    public void bar(){
        System.out.println("bar from "+getClass().getSimpleName());
    }
}
