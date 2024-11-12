package io.mateusnere.stragegy.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import io.mateusnere.stragegy.entity.Notification;
import io.mateusnere.stragegy.service.strategy.InstagramNotificationStrategy;
import io.mateusnere.stragegy.service.strategy.TiktokNotificationStrategy;
import io.mateusnere.stragegy.service.strategy.TwitterNotificationStrategy;
import io.mateusnere.stragegy.service.strategy.WhatsappNotificationStrategy;

@Service
public class NotificationService {

    Map<String, NotificationStrategy> mapOfNotifications = Map.of(
        "instagram", new InstagramNotificationStrategy(),
        "tiktok", new TiktokNotificationStrategy(),
        "twitter", new TwitterNotificationStrategy(),
        "whatsapp", new WhatsappNotificationStrategy()
    );
    
    public void notify(Notification notification) {
        mapOfNotifications.get(notification.channel()).sendNotification(notification.destination(), notification.message());
    }
}
