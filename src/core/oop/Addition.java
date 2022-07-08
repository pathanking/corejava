package core.oop;

public class Addition {
    /*public void add(int x, int y) {
        System.out.println("add(int x, int y) : " + (x + y));
    }*/

    public void add(byte x, byte y) {
        System.out.println("add(byte x, byte y) : " + (x + y));
    }

    public void add(short x, short y) {
        System.out.println("add(short x, short y) : " + (x + y));
    }

    /*public void add(long x, long y) {
        System.out.println("add(long x, long y) : " + (x + y));
    }*/

    public void add(char x, char y) {
        System.out.println("add(char x, char y) : " + (x + y));
    }

   /* public void add(float x, float y) {
        System.out.println("add(float x, float y) : " + (x + y));
    }*/

   /* public void add(double x, double y) {
        System.out.println("add(double x,double y) : " + (x + y));
    }*/

    /*public void add(Integer x, Integer y) {
        System.out.println("add(Integer x,Integer y) : " + (x + y));
    }*/

    public void add(int... x) { //var args
        System.out.println("add(int... x) : " + (x[0] + x[1]));
    }
}
