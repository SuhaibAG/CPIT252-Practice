package CommandDemo1;

public class LightssOnCommand implements Command{
    private Light light;

    public LightssOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
