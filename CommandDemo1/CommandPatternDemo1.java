package CommandDemo1;

public class CommandPatternDemo1 {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command lightsOn = new LightssOnCommand(livingRoomLight);
        Command lightsOff = new LightsOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl(lightsOn);
        remote.pressButton();

        remote = new RemoteControl(lightsOff);
        remote.pressButton();
    }
}
