package core.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap();
        hashMap.put("amit", 85);
        hashMap.put("ramya", 85);
        hashMap.put("murugan", 85);
        hashMap.put("sai", 85);
        hashMap.put("priya", 85);

        System.out.println(hashMap.size());

        hashMap.forEach((key, value) -> {
            System.out.println(key + " --> " + value);
        });

        System.out.println("--------------- Names -------------------");
        hashMap.keySet().forEach(System.out::println);
        System.out.println("--------------- Entries -------------------");
        hashMap.entrySet().forEach(System.out::println);
        System.out.println("--------------- Marks -------------------");
        hashMap.values().forEach(System.out::println);
    }
}
