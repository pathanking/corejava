package core.java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = (Integer i) -> i % 2 == 1;

        //boolean result =   compute(integerPredicate, 101);
        //System.out.println("is 101 is odd ? "+result);

        Function<String, String> function = (String string) -> string.toUpperCase();
        System.out.println("Result : " + compute(function, "hello"));

        BiFunction<Integer, Integer, Integer> biFunction = Integer::max;
        int max = biFunction.apply(100,500);
        System.out.printf("max of %d & %d is %d",100, 500, max);
    }

    public static String compute(Function<String, String> function, String string) {
        return function.apply(string);
    }
}
