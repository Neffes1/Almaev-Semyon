package services;

import database.DatabaseConnector;
import models.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductService {
    // Добавление товара
    public void addProduct(String name, double price, int departmentId) {
        String query = "INSERT INTO Product (name, price, department_id) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setDouble(2, price);
            stmt.setInt(3, departmentId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Удаление товара
    public void deleteProduct(int productId) {
        String query = "DELETE FROM Product WHERE id = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, productId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Обновление товара
    public void updateProduct(int productId, String name, double price, int departmentId) {
        String query = "UPDATE Product SET name = ?, price = ?, department_id = ? WHERE id = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setDouble(2, price);
            stmt.setInt(3, departmentId);
            stmt.setInt(4, productId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Получение всех товаров
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM Product";
        try (Connection conn = DatabaseConnector.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getInt("department_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    // Получение товаров по отделу
    public List<Product> getProductsByDepartment(int departmentId) {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM Product WHERE department_id = ?";
        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, departmentId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("price"),
                        rs.getInt("department_id")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    // Отделы без товаров
    public List<Integer> getDepartmentsWithoutProducts() {
        List<Integer> departments = new ArrayList<>();
        String query = "SELECT id FROM Department WHERE id NOT IN (SELECT DISTINCT department_id FROM Product)";
        try (Connection conn = DatabaseConnector.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                departments.add(rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }
}
