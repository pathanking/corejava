package core.collections;

import core.exceptions.Customer;
import core.pack2.C;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Customer, String> treeMap = new TreeMap<>(Comparator.comparing(Customer::firstName));
        treeMap.put(new Customer(101, "adam", "scott", "adam@email.com"), "FIRST");
        treeMap.put(new Customer(102, "will", "scott", "adam@email.com"), "FIRST");
        treeMap.put(new Customer(103, "tom", "scott", "adam@email.com"), "FIRST");
        treeMap.put(new Customer(104, "philip", "scott", "adam@email.com"), "FIRST");
        treeMap.put(new Customer(105, "joe", "scott", "adam@email.com"), "FIRST");

        treeMap.entrySet().forEach(System.out::println);

    }
}
