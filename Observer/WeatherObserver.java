package Observer;

public class WeatherObserver {
    public static void main(String[] args) {
        WeatherData  weatherData= new WeatherData();
        CurrentConditionDisplay currentCondition = new CurrentConditionDisplay();

        weatherData.registerObserver(currentCondition);

        weatherData.setMeasurement(60.2f, 65, 29);

        weatherData.setMeasurement(82.1f, 70, 22);

    }
}
