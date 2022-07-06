package core.oop.abstraction.smartphone;

public class OppoPhone extends SmartPhone {
    @Override
    public void call() {
        System.out.println("making a call from "+getClass().getSimpleName());
    }

    @Override
    public void text() {
        System.out.println("sending a text from "+getClass().getSimpleName());
    }
}
