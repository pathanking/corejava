package core;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        byte b = 126;
        byte[] bytes = new byte[10]; //an object of bytes array
        System.out.println("Enter 10 byte elements >>>");
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = new Scanner(System.in).nextByte();
        }
        /*byte[] bytes1 = {1, 2, 3, 4, 5};
        byte[] bytes2 = new byte[]{2, 3, 4, 5, 6, 7, 8, 9};*/
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println(b); //126
        System.out.println(bytes); //hashcode
        /*System.out.println(bytes1);
        System.out.println(bytes2);
        System.out.println(bytes.length);
        System.out.println(bytes1.length);
        System.out.println(bytes2.length);*/
        //System.out.println(bytes.getClass().getSimpleName());
    }
}
