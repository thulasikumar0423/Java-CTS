package com.rev.workforce.service;

import com.rev.workforce.model.Notification;
import com.rev.workforce.repository.NotificationRepository;

public class NotificationService {

    private final NotificationRepository notificationRepository = new NotificationRepository();

    public void sendNotification(Notification notification) {
        if (notification == null) {
            throw new IllegalArgumentException("Notification cannot be null");
        }
        notificationRepository.saveNotification(notification);
    }
}
