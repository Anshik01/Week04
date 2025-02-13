package com.mapinterface.groupobject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // creating the employee map
        HashMap<Department, ArrayList<Employee>> employeeMap = new HashMap<>();

        // creating the department objects
        Department hr = new Department("HR");
        Department it = new Department("IT");
        Department marketing = new Department("Marketing");

        // creating employees and adding them to the departments
        Employee employee1 = new Employee("Person1", hr);
        Employee employee2 = new Employee("Person2", it);
        Employee employee3 = new Employee("Person3", marketing);
        Employee employee4 = new Employee("Person4", hr);
        Employee employee5 = new Employee("Person5", it);
        Employee employee6 = new Employee("Person6", marketing);
        Employee employee7 = new Employee("Person7", hr);
        Employee employee8 = new Employee("Person8", it);

        // mapping the department and employees together
        employeeMap.put(hr, hr.employees);
        employeeMap.put(it, it.employees);
        employeeMap.put(marketing, marketing.employees);

        // displaying employee map
        System.out.println("Employee Map:");
        for (Map.Entry <Department, ArrayList<Employee>> i : employeeMap.entrySet()) {
            System.out.print(i.getKey().name + " : [");
            for (int j = 0; j < i.getValue().size(); j++) {
                System.out.print(i.getValue().get(j).name);
                if(j != i.getValue().size()-1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
