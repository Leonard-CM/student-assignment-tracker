package com.app.creational_patterns.factory_method;


import com.app.model.Notification;

public class EmailNotificationFactory implements NotificationFactory {

    @Override
    public Notification createNotification(String message) {
        return new Notification("Email: " + message);
    }
}