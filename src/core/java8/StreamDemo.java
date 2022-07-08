package core.java8;

import core.exceptions.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        int sumOfOdds = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).filter(a -> a % 2 == 1).sum();
        System.out.println(sumOfOdds);

        Stream<String> stringStream = Stream.of("hi", "hello", "how", "who", "we", "there", "hola");
        stringStream.filter(x -> x.charAt(0) == 'h').map(abc -> abc.toUpperCase()).forEach(System.out::println);

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Sum of square of even numbers "+IntStream.of(ints).filter(value -> value%2 == 0).map(value -> value * value).sum());

        List<Customer> list = List.of(new Customer(101, "John", "Doe", "john@email.com"),
                new Customer(102, "James", "Doe", "john@email.com"),
                new Customer(103, "Jonas", "Doe", "john@email.com"),
                new Customer(104, "Ralph", "Doe", "john@email.com"),
                new Customer(105, "Adam", "Doe", "john@email.com"));

        List<Customer> customersWithFirstNameJ =  list.stream().filter(e -> e.firstName().charAt(0)=='J').collect(Collectors.toList());
        customersWithFirstNameJ.forEach(System.out::println);
    }
}
