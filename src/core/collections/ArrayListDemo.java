package core.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("hi");
        arrayList.add(100);
        arrayList.add(Double.valueOf(20.5));
        arrayList.add(new StringBuilder("hey"));
        arrayList.add(Boolean.valueOf(false));
        arrayList.add(true);
        arrayList.add(Byte.valueOf((byte) 129));
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("hi");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(String.valueOf(Integer.valueOf(10))); //"10";
        arrayList1.add(new String("hello"));
        arrayList1.add("hello");
        arrayList1.add(new StringBuilder("hi").toString());
        arrayList1.add(new StringBuffer("hi").toString());
        arrayList1.add(String.valueOf(Boolean.valueOf("false"))); //"abc" , "false",
        arrayList1.add(0, "luv");
        arrayList1.add(5, "me");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("delhi");
        arrayList2.add("chennai");

        arrayList2.addAll(arrayList1);
        System.out.println("After Adding ArrayList1 : >>>");
        System.out.println("Size : "+arrayList2.size());
        arrayList2.forEach(System.out::println);


        arrayList2.removeAll(arrayList1);
        System.out.println("After Removing ArrayList1 : >>>");
        System.out.println("Size : "+arrayList2.size());
        arrayList2.forEach(System.out::println);

    }
}
