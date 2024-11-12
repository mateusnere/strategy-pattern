package io.mateusnere.stragegy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.mateusnere.stragegy.entity.Notification;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    Logger logger = LoggerFactory.getLogger(NotificationController.class);

    @PostMapping
    public ResponseEntity<String> sendNotification(@RequestBody Notification notification) {
        
        if(notification.channel().equals("instagram")) {
            logger.info("Instagram (@{}): {}", notification.destiny(), notification.message());
        } else if(notification.channel().equals("tiktok")) {
            logger.info("TikTok (@{}): {}", notification.destiny(), notification.message());
        } else if(notification.channel().equals("twitter")) {
            logger.info("X/Twitter (@{}): {}", notification.destiny(), notification.message());
        } else if(notification.channel().equals("whatsapp")) {
            logger.info("Whatsapp [{}]: {}", notification.destiny(), notification.message());
        }
        return ResponseEntity.ok().body("Notification sent!");
    }
}
