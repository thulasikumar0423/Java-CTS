package com.rev.workforce.repository;

import com.rev.workforce.model.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {

    public void addDepartment(Department dept) {
        String sql = "INSERT INTO department (department_id, department_name) VALUES (?, ?)";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, dept.getDepartmentId());
            ps.setString(2, dept.getDepartmentName());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Department> getAllDepartments() {
        List<Department> list = new ArrayList<>();
        String sql = "SELECT * FROM department";

        try (Connection conn = DBConnectionUtil.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Department(
                        rs.getInt("department_id"),
                        rs.getString("department_name")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
