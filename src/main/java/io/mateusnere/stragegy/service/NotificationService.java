package io.mateusnere.stragegy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import io.mateusnere.stragegy.controller.NotificationController;
import io.mateusnere.stragegy.entity.Notification;

@Service
public class NotificationService {

    Logger logger = LoggerFactory.getLogger(NotificationController.class);
    
    public void notify(Notification notification) {
        if(notification.channel().equals("instagram")) {
            logger.info("Instagram (@{}): {}", notification.destiny(), notification.message());
        } else if(notification.channel().equals("tiktok")) {
            logger.info("TikTok (@{}): {}", notification.destiny(), notification.message());
        } else if(notification.channel().equals("twitter")) {
            logger.info("X/Twitter (@{}): {}", notification.destiny(), notification.message());
        } else if(notification.channel().equals("whatsapp")) {
            logger.info("Whatsapp [{}]: {}", notification.destiny(), notification.message());
        }
    }
}
