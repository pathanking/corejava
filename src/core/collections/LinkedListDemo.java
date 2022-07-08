package core.collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(101);
        linkedList.add(109);
        linkedList.add(108);
        linkedList.add(107);
        linkedList.add(106);
        linkedList.add(105);
        linkedList.add(104);
        linkedList.add(Integer.valueOf(103));
        linkedList.add(new Integer(102));

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));

    }
}