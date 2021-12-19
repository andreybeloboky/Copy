package com.company;

public class EmployeeClon implements Cloneable {
    private int id;
    private String name;
    public Date date;

    public EmployeeClon(int id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    public EmployeeClon clone() throws CloneNotSupportedException {
        EmployeeClon employeeClon = (EmployeeClon) super.clone();
        employeeClon.date = date.clone();
        return employeeClon;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
