package core.oop.abstraction;

import core.oop.abstraction.smartphone.SmartPhone;
import core.oop.abstraction.smartwatch.SmartWatch;

import java.util.Scanner;

public class SmartDevices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] SmartWatch");
        System.out.println("[2] SmartPhone");
        switch (scanner.nextInt()){
            case 1:
                System.out.println("Buy SmartWatch : [realme] | [boat] | [vivo]");
                String input = scanner.next();
                SmartWatch smartWatch = SmartWatchFactory.smartWatch(input);
                smartWatch.pickCall();
                smartWatch.showTime();
                break;
            case 2:
                System.out.println("Buy SmartPhone : [iphone] | [samsung] | [OnePlus]");
                String input2 = scanner.next();
                SmartPhone smartPhone = SmartPhoneFactory.smartPhone(input2);
                smartPhone.call();
                smartPhone.text();
                break;
            default:
                System.out.println("Invalid Input!!");
        }
    }
}
