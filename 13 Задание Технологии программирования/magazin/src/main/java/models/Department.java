package models;

public class Department {
    private int id;
    private String name;
    private String workingHours;

    public Department(int id, String name, String workingHours) {
        this.id = id;
        this.name = name;
        this.workingHours = workingHours;
    }

    // Getters и Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getWorkingHours() { return workingHours; }
    public void setWorkingHours(String workingHours) { this.workingHours = workingHours; }
}
