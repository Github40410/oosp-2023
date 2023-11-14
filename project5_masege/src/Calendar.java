import java.util.ArrayList;
import java.util.List;

public class Calendar implements Subject{
    private List<Observer> observers;
    private String upcomingEvent;

    public Calendar() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void addEvent(String event) {
        this.upcomingEvent = event;
        notifyObservers(event);
    }
}
