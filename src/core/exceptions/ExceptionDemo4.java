package core.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Word Starting With \'a\' | \'A\'");
        String string = bufferedReader.readLine();
        try {
            process(string);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void process(String string) throws MyException {
        if (string.charAt(0) == 'a' || string.charAt(0) == 'A') System.out.println("Here's Your Input - " + string);
        else throw new MyException(string + " doesn't start with \'a\' | \'A\'");
    }
}
