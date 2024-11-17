package services;

import database.DatabaseConnector;
import models.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    public void addDepartment(String name, String workingHours) {
        String query = "INSERT INTO Department (name, working_hours) VALUES (?, ?)";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, workingHours);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<>();
        String query = "SELECT * FROM Department";
        try (Connection conn = DatabaseConnector.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                departments.add(new Department(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("working_hours")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }

    public void deleteDepartment(int id) {
        String query = "DELETE FROM Department WHERE id = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
