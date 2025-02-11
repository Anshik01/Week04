package com.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

// definition of Course generic class
public class Course <T extends CourseType> {
    // attribute of this class
    private List<T> courses;

    // created a non parameterized constructor
    public Course() {
        courses = new ArrayList<>(); // initializing the list
    }

    // method to add courses to the list
    public void addCourse(T obj) {
        courses.add(obj);
    }

    // getter method to get courses list
    public List<T> getCourses() {
        return courses;
    }
}
