package Observer;

public class CurrentConditionDisplay implements Observer{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
    public void display(){
        System.out.println("Current condition: " + temperature + "F degree and " + humidity + "% humidity and " + pressure +"PSI");
    }
}
