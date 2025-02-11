package com.universitycoursemanagement;
import java.util.List;

// definition of CourseType class which is abstract
abstract public class CourseType {
    // declaring attributes of this class
    protected String name, type;
    protected int durationInMonths;

    // declaring an abstract setter method
    abstract void setCourseAttributes(String name, int durationInMonths);

    // created a method to display details of all courses
    public static void displayCourses(List<? extends CourseType> list) {
        for (CourseType o : list) {
            System.out.println("Course Type: " + o.type + "\nCourse Name: " + o.name + "\nDuration In Months: " + o.durationInMonths);
        }
    }
}
