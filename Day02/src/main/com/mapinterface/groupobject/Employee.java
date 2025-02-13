package com.mapinterface.groupobject;

public class Employee {
    // declaring attributes of this class
    String name, department;

    // parameterized constructor to initialize the objects
    Employee(String name, Department department) {
        this.name = name;
        this.department = department.name;
        department.addEmployee(this);
    }
}
