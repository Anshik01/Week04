package com.universitycoursemanagement;

// definition of AssignmentCourse class that inherits CourseType class
public class AssignmentCourse extends CourseType{
    // overriding the setter method of CourseType class
    @Override
    public void setCourseAttributes(String name, int durationInMonths){
        this.name = name;
        this.durationInMonths = durationInMonths;
        this.type = "Assignment Course";
    }
}
