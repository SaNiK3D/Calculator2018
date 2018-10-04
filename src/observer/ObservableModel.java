package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.10.2018
 */
public abstract class ObservableModel {
    private final List<ObserverModel> observers;

    protected ObservableModel() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(ObserverModel o) {
        observers.add(o);
    }

    public void removeObserver(ObserverModel o) {
        observers.remove(o);
    }

    public void notifyObservers(String data) {
        for (ObserverModel observer : observers)
            observer.update(data);
    }
}
