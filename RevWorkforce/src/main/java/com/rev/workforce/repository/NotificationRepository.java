package com.rev.workforce.repository;

import com.rev.workforce.model.Notification;

import java.sql.*;

public class NotificationRepository {

    public void saveNotification(Notification n) {
        String sql = "INSERT INTO notification (notification_id, employee_id, message, is_read) VALUES (?, ?, ?, ?)";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, n.getNotificationId());
            ps.setInt(2, n.getEmployee().getEmployeeId());
            ps.setString(3, n.getMessage());
            ps.setBoolean(4, n.isRead());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
