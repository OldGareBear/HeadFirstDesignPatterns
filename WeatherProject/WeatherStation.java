public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 68, 34.1f);
    weatherData.setMeasurements(78, 61, 27.9f);
  }
}