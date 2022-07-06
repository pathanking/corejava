package core;

public class WhileLoopDemo2 {
    //sum of first ten numbers
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;
        while (i <= 10){
            sum += i;
            i ++;
        }

        System.out.printf("Sum : %d",sum);
    }
}
