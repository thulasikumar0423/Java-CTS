package com.rev.workforce.repository;

import com.rev.workforce.model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LeaveRepository {

    public void applyLeave(Leave leave) {
        String sql = "INSERT INTO leave_application " +
                "(employee_id, leave_type, start_date, end_date, reason, status, applied_date) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";


        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, leave.getEmployee().getEmployeeId());
            ps.setString(2, leave.getLeaveType().name());
            ps.setDate(3, java.sql.Date.valueOf(leave.getStartDate()));
            ps.setDate(4, java.sql.Date.valueOf(leave.getEndDate()));
            ps.setString(5, leave.getReason());
            ps.setString(6, leave.getStatus().name());
            ps.setDate(7, java.sql.Date.valueOf(leave.getAppliedDate()));

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Leave> getLeavesByEmployee(int empId) {
        List<Leave> list = new ArrayList<>();
        String sql = "SELECT * FROM leave_application WHERE employee_id = ?";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, empId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Leave l = new Leave();
                l.setLeaveId(rs.getInt("leave_id"));
                l.setLeaveType(LeaveType.valueOf(rs.getString("leave_type")));
                l.setStatus(LeaveStatus.valueOf(rs.getString("status")));
                list.add(l);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
