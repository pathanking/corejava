package core.collections;

import core.exceptions.Customer;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("zen");
        treeSet.add("wen");
        treeSet.add("amd");
        treeSet.add("bdc");
        treeSet.add("eyp");

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(Integer.valueOf("10"));
        treeSet1.add(Integer.valueOf("20"));
        treeSet1.add(Integer.valueOf("30"));
        treeSet1.add(Integer.valueOf("40"));
        treeSet1.add(Integer.valueOf("70"));
        treeSet1.add(Integer.valueOf("90"));

//        treeSet1.forEach(System.out::println);

        TreeSet<Customer> customerTreeSet = new TreeSet<>(Comparator.comparing(Customer::lastName));
        customerTreeSet.add(new Customer(105,"john", "miller", "john@email.com"));
        customerTreeSet.add(new Customer(102,"zayn", "khan", "john@email.com"));
        customerTreeSet.add(new Customer(103,"adam", "scott", "john@email.com"));
        customerTreeSet.add(new Customer(104,"tom", "cruise", "john@email.com"));
        customerTreeSet.add(new Customer(101,"will", "smith", "john@email.com"));

        System.out.println(customerTreeSet.size());
        customerTreeSet.forEach(System.out::println);
    }
}
