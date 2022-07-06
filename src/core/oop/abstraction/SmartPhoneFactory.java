package core.oop.abstraction;

import core.oop.abstraction.smartphone.OppoPhone;
import core.oop.abstraction.smartphone.SamsungPhone;
import core.oop.abstraction.smartphone.SmartPhone;
import core.oop.abstraction.smartphone.iPhone;

public class SmartPhoneFactory {
    private static SmartPhone smartPhone = null;

    private SmartPhoneFactory(){}

    public static SmartPhone smartPhone(String choice) {
        switch (choice) {
            case "iphone", "IPhone", "IPHONE" -> {
                smartPhone =  new iPhone();
            }
            case "SAMSUNG", "Samsung", "samsung" -> {
                smartPhone =  new SamsungPhone();
            }
            case "Oppo", "oppo", "OPPO" -> {
                smartPhone =  new OppoPhone();
            }
            default -> throw new RuntimeException("Invalid Input!!");
        }
        return smartPhone;
    }
}
