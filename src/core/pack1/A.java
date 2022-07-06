package core.pack1;

public class A {
    private int i = 10; //access only inside the class
    protected int j = 20;
    public int k = 30;
    int m = 40; //no modifier or package-private

    public static void main(String[] args) {
        A obj = new A();
        System.out.println("i : "+obj.i);
        System.out.println("j : "+obj.j);
        System.out.println("k : "+obj.k);
        System.out.println("m : "+obj.m);
    }
}
