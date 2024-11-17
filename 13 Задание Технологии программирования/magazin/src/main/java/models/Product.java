package models;

public class Product {
    private int id;
    private String name;
    private double price;
    private int departmentId;

    public Product(int id, String name, double price, int departmentId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.departmentId = departmentId;
    }

    // Getters и Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }
}
