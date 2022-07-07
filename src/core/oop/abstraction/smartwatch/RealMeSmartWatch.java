package core.oop.abstraction.smartwatch;

import core.oop.abstraction.FiveGEnabler;

import java.time.LocalTime;

public class RealMeSmartWatch extends SmartWatch implements FiveGEnabler {
    @Override
    public void showTime() {
        System.out.println("showing time from " + getClass().getSimpleName() + " : " + LocalTime.now());
    }

    @Override
    public void pickCall() {
        System.out.println("picking up a call using bluetooth from " + getClass().getSimpleName());
        enable5G();
    }

    @Override
    public void enable5G() {
        System.out.println("5G enabled Successfully in "+ getClass().getSimpleName());
    }
}
