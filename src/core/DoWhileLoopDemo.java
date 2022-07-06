package core;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        //sum of first ten numbers
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("Sum : " + sum);
    }
}
