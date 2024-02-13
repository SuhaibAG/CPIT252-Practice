package bridgepatterndemo;

public class Bulb implements Switch{
    @Override
    public void switchOff() {
        System.out.println("BULB Switched Off");
    }

    @Override
    public void switchOn() {
        System.out.println("BULB Switched ON");
    }
}
