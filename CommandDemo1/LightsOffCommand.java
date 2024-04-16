package CommandDemo1;

public class LightsOffCommand implements Command{
    private Light light;

    public LightsOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOff();
    }

}
