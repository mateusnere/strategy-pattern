package io.mateusnere.stragegy.service.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.mateusnere.stragegy.service.NotificationStrategy;

public class WhatsappNotificationStrategy implements NotificationStrategy {

    Logger logger = LoggerFactory.getLogger(WhatsappNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Whatsapp [{}]: {}", destination, message);
    }
    
}
