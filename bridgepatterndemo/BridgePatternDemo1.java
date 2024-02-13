package bridgepatterndemo;

public class BridgePatternDemo1 {
    public static void main(String[] args) {
        Switch obj = new Fan();
        obj.switchOff();
        obj.switchOn();

        obj = new Bulb();
        obj.switchOff();
        obj.switchOn();
    }
}
