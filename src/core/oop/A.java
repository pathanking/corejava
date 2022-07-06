package core.oop;

public class A {
    int i = 10; //instance variable

    public void show() { //instance method
        int i = 99;
        System.out.println("i : " + this.i);
    }

    public static void main(String[] args) { //static method
        A obj = new A();
        obj.show();
        //show();
    }
}
