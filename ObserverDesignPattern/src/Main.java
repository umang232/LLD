public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherApp weatherApp = new WeatherApp();
        weatherStation.addObserver(weatherApp);
        weatherStation.setTemperature(20);
        WeatherAlert weatherAlert = new WeatherAlert();
        weatherStation.addObserver(weatherAlert);
        weatherStation.setTemperature(40);
        weatherStation.setTemperature(23);
    }
}