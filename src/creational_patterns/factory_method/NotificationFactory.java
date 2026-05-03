package creational_patterns.factory_method;

import app.Notification;

public interface NotificationFactory {
    Notification createNotification(String message);
}