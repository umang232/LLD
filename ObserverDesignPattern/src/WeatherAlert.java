public class WeatherAlert implements Observer{

    @Override
    public void update(int temperature) {
        if(temperature > 35){
            System.out.println("Temperature is pretty high :  "+ temperature+ " Degrees");
        }
    }
}
