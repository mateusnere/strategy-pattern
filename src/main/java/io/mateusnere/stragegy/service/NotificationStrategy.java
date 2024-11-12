package io.mateusnere.stragegy.service;

public interface NotificationStrategy {
    
    void sendNotification(String destination, String message);
}
