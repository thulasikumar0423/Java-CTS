package com.rev.workforce.model;

import java.time.LocalDateTime;

public class Notification {

    private int notificationId;
    private Employee employee;
    private String message;
    private boolean read;
    private LocalDateTime createdAt;

    public Notification() {
    }

    public Notification(int notificationId, Employee employee, String message) {
        this.notificationId = notificationId;
        this.employee = employee;
        this.message = message;
        this.read = false;
        this.createdAt = LocalDateTime.now();
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", read=" + read +
                '}';
    }
}
