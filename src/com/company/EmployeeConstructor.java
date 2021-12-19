package com.company;

public class EmployeeConstructor {
    private int id;
    private String name;
    private Date subjects;

    public EmployeeConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeConstructor(EmployeeConstructor employee) {
        this(employee.getId(), employee.getName());
        this.subjects = new Date(employee.subjects);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
