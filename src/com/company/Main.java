package com.company;

public class Main {

    public static void main(String[] args) {

        // copy constructor;
        EmployeeConstructor e = new EmployeeConstructor(1, "1");
        EmployeeConstructor a = new EmployeeConstructor(e);
        a.setId(13);
        System.out.println(e.getId());
        System.out.println(a.getId());


        // copy clon();
        EmployeeClon main = new EmployeeClon(1, "3", new Date(2));
        EmployeeClon copy = null;
        try {
            copy = main.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        copy.setId(10011);
        System.out.println(main.getId());
        System.out.println(copy.getId());
        copy.date.setKek(333);
        System.out.println(main.date.getKek());
        System.out.println(copy.date.getKek());

        // Factory methods
        EmployeeStatic.newInstance(1, "Kek");
    }
}
