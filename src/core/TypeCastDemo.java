package core;

public class TypeCastDemo {
    public static void main(String[] args) {
        double d = 10.5;
        System.out.println(d);
        int i = (int) d; //down casting or narrowing or explicit casting
        System.out.println(i);
        System.out.println("---------------------");
        int k = 20;
        System.out.println(k);
        double m = k; //upcasting or widening or implicit casting
        System.out.println(m);
    }
}
