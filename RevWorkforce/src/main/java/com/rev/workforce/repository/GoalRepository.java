package com.rev.workforce.repository;

import com.rev.workforce.model.Goal;
import com.rev.workforce.model.GoalPriority;

import java.sql.*;

public class GoalRepository {

    public void addGoal(Goal goal) {
        String sql = "INSERT INTO goal (goal_id, employee_id, description, priority, progress) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, goal.getGoalId());
            ps.setInt(2, goal.getEmployee().getEmployeeId());
            ps.setString(3, goal.getDescription());
            ps.setString(4, goal.getPriority().name());
            ps.setInt(5, goal.getProgressPercentage());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
