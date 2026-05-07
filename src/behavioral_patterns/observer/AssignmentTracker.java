package behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class AssignmentTracker implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void assignmentUpdated(String update) {
        notifyObservers(update);
    }
}
