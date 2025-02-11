package com.universitycoursemanagement;

import java.util.Scanner;

// definition of Main class
public class Main {
    // main method
    public static void main(String[] args) {
        Course<CourseType> course = new Course<>(); // object of Course class
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for number of courses from user
        System.out.println("Enter Number of Courses: ");
        int numberOfCourses = sc.nextInt();

        // taking inputs for courses from user
        System.out.println("Enter Courses Details: ");
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Select Type: \n1) For Exam Course\n2) For Assignment Courses\n3) For Research Courses");
            int type = sc.nextInt();

            // creating object of class as per selection of the user
            CourseType obj = (type == 1)? new ExamCourse() :(type == 2)? new AssignmentCourse() :(type == 3)? new ResearchCourse() : null;

            // if user enters wrong value for selection of type
            if (obj == null) {
                System.out.println("Please Select A Valid Type.");
                i--; // so that user can enter as many courses as he wants
                continue;
            }

            // taking inputs for the attributes
            System.out.println("Enter Name: ");
            String name = sc.next();
            System.out.println("Enter Duration In Months: ");
            int durationInMonths = sc.nextInt();

            obj.setCourseAttributes(name, durationInMonths); // setting attributes
            course.addCourse(obj); // adding course to CourseList

            System.out.println();
        }

        // displaying details of all courses
        System.out.println("Displaying All courses:");
        CourseType.displayCourses(course.getCourses());
    }
}
