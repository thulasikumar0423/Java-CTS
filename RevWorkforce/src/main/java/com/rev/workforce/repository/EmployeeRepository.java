package com.rev.workforce.repository;

import com.rev.workforce.model.Employee;
import com.rev.workforce.model.Role;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    public void addEmployee(Employee employee) {
        String sql = "INSERT INTO employee (employee_id, name, email, role, password, active) VALUES (?, ?, ?, ?, ?, ?)";


        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, employee.getEmployeeId());
            ps.setString(2, employee.getName());
            ps.setString(3, employee.getEmail());
            ps.setString(4, employee.getRole().name());
            ps.setString(5, employee.getPassword());
            ps.setBoolean(6, employee.isActive());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employee WHERE employee_id = ?";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Employee e = new Employee();
                e.setEmployeeId(rs.getInt("employee_id"));
                e.setName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setRole(Role.valueOf(rs.getString("role")));
                e.setActive(rs.getBoolean("active"));
                e.setPassword(rs.getString("password"));

                return e;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try (Connection conn = DBConnectionUtil.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Employee e = new Employee();
                e.setEmployeeId(rs.getInt("employee_id"));
                e.setName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setRole(Role.valueOf(rs.getString("role")));
                e.setActive(rs.getBoolean("active"));
                list.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void deactivateEmployee(int id) {
        String sql = "UPDATE employee SET active = false WHERE employee_id = ?";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Employee> getEmployeesByManager(int managerId) {

        List<Employee> team = new ArrayList<>();

        String sql = "SELECT * FROM employee WHERE manager_id = ?";

        try (Connection conn = DBConnectionUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, managerId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Employee e = new Employee();
                e.setEmployeeId(rs.getInt("employee_id"));
                e.setName(rs.getString("name"));
                e.setEmail(rs.getString("email"));
                e.setRole(Role.valueOf(rs.getString("role")));
                e.setActive(rs.getBoolean("active"));
                team.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return team;
    }
}

