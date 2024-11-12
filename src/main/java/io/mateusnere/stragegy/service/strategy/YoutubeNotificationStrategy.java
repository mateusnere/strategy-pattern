package io.mateusnere.stragegy.service.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.mateusnere.stragegy.service.NotificationStrategy;

public class YoutubeNotificationStrategy implements NotificationStrategy {

    Logger logger = LoggerFactory.getLogger(YoutubeNotificationStrategy.class);

    @Override
    public void sendNotification(String destination, String message) {
        logger.info("Youtube (@{}): {}", destination, message);
    }

    
}
