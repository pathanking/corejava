package core;

public class ForLoopDemo {
    public static void main(String[] args) {
        //the sum of odd integers
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1)
                sum += i;
        }

        System.out.println("sum of odd numbers : " + sum);
    }
}
