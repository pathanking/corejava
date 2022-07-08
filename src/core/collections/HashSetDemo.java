package core.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hi");
        hashSet.add(null);
        hashSet.add("hello");

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("welcome");
        arrayList.add("welcome");
        arrayList.add("welcome");


        hashSet.addAll(arrayList);

        System.out.println(hashSet.size());
        hashSet.forEach(System.out::println);
    }
}
