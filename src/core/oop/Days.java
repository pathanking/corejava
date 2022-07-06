package core.oop;

import java.util.Arrays;

public enum Days {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

enum CustomerType {
    REGULAR, PREMIUM, SILVER
}

class DaysTest {
    public static void main(String[] args) {
        Arrays.stream(Days.values()).forEach(System.out::println);

        Days day = Days.FRI;

        String result = process(day);
        System.out.println(result);
    }

    public static String process(Days day) {
        switch (day) {
            case MON -> {
                return "It's Monday";
            }
            case TUE -> {
                return "It's Tuesday";
            }
            case WED -> {
                return "It's Wednesday";
            }
            case THU -> {
                return "It's Thursday";
            }
            case FRI -> {
                return "It's Friday";
            }
            case SAT -> {
                return "It's Saturday";
            }
            case SUN -> {
                return "It's Sunday";
            }
            default -> {
                return "invalid input";
            }
        }
    }
}