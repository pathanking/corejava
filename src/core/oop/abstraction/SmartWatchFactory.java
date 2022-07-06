package core.oop.abstraction;

import core.oop.abstraction.smartwatch.BoatSmartWatch;
import core.oop.abstraction.smartwatch.RealMeSmartWatch;
import core.oop.abstraction.smartwatch.SmartWatch;
import core.oop.abstraction.smartwatch.VivoSmartWatch;

public class SmartWatchFactory {

    private static SmartWatch smartWatch;

    private SmartWatchFactory(){}

    public static SmartWatch smartWatch(String choice) {
        switch (choice) {
            case "boat", "BOAT", "Boat" -> {
                smartWatch  =  new BoatSmartWatch();
            }
            case "realme", "RealMe", "Realme", "REALME" -> {
                smartWatch =  new RealMeSmartWatch();
            }
            case "vivo", "Vivo", "VIVO" -> {
                smartWatch = new VivoSmartWatch();
            }
            default -> throw new RuntimeException("Invalid Input!!");
        }
        return smartWatch;
    }
}
