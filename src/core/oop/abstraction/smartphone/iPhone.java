package core.oop.abstraction.smartphone;

import core.oop.abstraction.FiveGEnabler;

public class iPhone extends SmartPhone implements FiveGEnabler {
    @Override
    public void call() {
        System.out.println("making a call from "+getClass().getSimpleName());
    }

    @Override
    public void text() {
        System.out.println("sending a text from "+getClass().getSimpleName());
        enable5G();
    }

    @Override
    public void enable5G() {
        System.out.println("5G has been enabled Successfully in "+getClass().getSimpleName());
    }
}
