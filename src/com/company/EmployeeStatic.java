package com.company;

public class EmployeeStatic {

    private int id = 5;
    private String name = "kek";

    public static EmployeeConstructor newInstance(int id, String name) {
        return new EmployeeConstructor(id, name);
    }
}
