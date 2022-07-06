package core;

import java.util.stream.IntStream;

/*
array: group of similar kind of elements
 */
public class ForLoopDemo2 {
    public static void main(String[] args) {
        int[] ints = new int[5]; //syntax 1

        ints[0] = 10;
        ints[1] = 20;
        ints[2] = 30;
        ints[3] = 40;
        ints[4] = 50;
        System.out.println("ints array length : " + ints.length);

        int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if(max < ints[i])
                max = ints[i];
        }

        System.out.println("Max Element : "+max);
        //System.out.println("Max Element : " + IntStream.of(ints).max().getAsInt());
        //System.out.println("Min Element : " + IntStream.of(ints).min().getAsInt());
    }
}
