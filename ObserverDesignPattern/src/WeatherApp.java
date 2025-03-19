public class WeatherApp implements Observer{
    @Override
    public void update(int temperature) {
        System.out.println("The current temperature is : "+ temperature + " Degrees");
    }
}
