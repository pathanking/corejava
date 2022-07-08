package core.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo3 {
    public static void main(String[] args) throws IOException {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter two index numbers [0-8] >>>");
        int n1 = Integer.parseInt(bufferedReader.readLine());
        int n2 = Integer.parseInt(bufferedReader.readLine());
        if (n1 < ints.length && n2 < ints.length) {
            if (n1 != 0) System.out.println(ints[n2] / ints[n1]);
            else System.out.println("Denominator Can't Be Zero");
        } else System.out.println("Invalid Index");
    }
}
