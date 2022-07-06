package core.oop.abstraction.smartwatch;

import java.time.LocalTime;

public class VivoSmartWatch extends SmartWatch {
    @Override
    public void showTime() {
        System.out.println("showing time from " + getClass().getSimpleName() + " : " + LocalTime.now());
    }

    @Override
    public void pickCall() {
        System.out.println("picking up a call using bluetooth from " + getClass().getSimpleName());
    }
}
