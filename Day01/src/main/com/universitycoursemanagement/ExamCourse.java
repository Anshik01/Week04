package com.universitycoursemanagement;

// definition of ExamCourse class that inherits CourseType class
public class ExamCourse extends CourseType{
    // overriding the setter method of CourseType class
    @Override
    public void setCourseAttributes(String name, int durationInMonths){
        this.name = name;
        this.durationInMonths = durationInMonths;
        this.type = "Exam Course";
    }
}
