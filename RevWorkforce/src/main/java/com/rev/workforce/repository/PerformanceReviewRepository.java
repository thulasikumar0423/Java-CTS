package com.rev.workforce.repository;

import com.rev.workforce.model.PerformanceReview;
import com.rev.workforce.model.PerformanceStatus;

import java.sql.*;

public class PerformanceReviewRepository {

    public void saveReview(PerformanceReview review) {
        String sql = "INSERT INTO performance_review (review_id, employee_id, status) VALUES (?, ?, ?)";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, review.getReviewId());
            ps.setInt(2, review.getEmployee().getEmployeeId());
            ps.setString(3, review.getStatus().name());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
