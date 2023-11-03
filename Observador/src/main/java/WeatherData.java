import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature, humity, pressure;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o: observers){
            o.update(temperature,humity,pressure);
        }
    }

    public void measurementsChanged(){
        //Más acciones
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humity, float pressure){
        this.temperature = temperature;
        this.humity = humity;
        this.pressure = pressure;

        measurementsChanged();
    }
}
