package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileLoopDemo {
    public static void main(String[] args) {
        List<String> list = List.of("hi", "hello", "how", "you", "there", "me", "hey");
        //System.out.println(list.size());//list.remove("hi");
        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            if (string.charAt(0) == 'h')
                System.out.println(string.toUpperCase());
        }*/

        list.stream().filter(e -> e.charAt(0)=='h').map(String::toUpperCase).forEach(System.out::println);
    }
}
