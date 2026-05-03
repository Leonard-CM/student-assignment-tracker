package creational_patterns.factory_method;


import app.Notification;

public class EmailNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification(String message) {
        return new Notification("Email: " + message);
    }
}