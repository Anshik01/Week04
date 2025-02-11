package com.universitycoursemanagement;

// definition of ResearchCourse class that inherits CourseType class
public class ResearchCourse extends CourseType{
    // overriding the setter method of CourseType class
    @Override
    public void setCourseAttributes(String name, int durationInMonths){
        this.name = name;
        this.durationInMonths = durationInMonths;
        this.type = "Research Course";
    }
}
