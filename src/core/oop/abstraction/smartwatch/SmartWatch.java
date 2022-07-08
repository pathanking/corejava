package core.oop.abstraction.smartwatch;

import java.time.LocalDate;

public abstract class SmartWatch {
    public abstract void showTime();
    public abstract void pickCall();

    public void showDate(){
        System.out.println("showing date from "+getClass().getSimpleName()+" : "+ LocalDate.now());
    }
}

