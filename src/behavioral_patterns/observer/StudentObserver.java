package behavioral_patterns.observer;

public class StudentObserver implements Observer {
    private String name;

    public StudentObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}
