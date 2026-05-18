package com.app.creational_patterns.factory_method;

import com.app.model.Notification;

public interface NotificationFactory {
    Notification createNotification(String message);
}