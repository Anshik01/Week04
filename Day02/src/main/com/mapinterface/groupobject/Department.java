package com.mapinterface.groupobject;

import java.util.ArrayList;

public class Department {
    // declaring attributes of this class
    String name;
    ArrayList <Employee> employees;

    // parameterized constructor to initialize the objects
    Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // method to add employees in the employees list
    void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
