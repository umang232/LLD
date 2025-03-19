import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    List<Observer> observers = new ArrayList<>();
    int temperature;
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void updateObserver(int temperature){
        for(Observer observer: observers){
            observer.update(temperature);
        }
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        updateObserver(temperature);
    }

}
