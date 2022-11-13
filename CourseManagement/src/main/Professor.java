package main;

import java.util.ArrayList;

public class Professor extends Department.Employee {

    public ArrayList<Course> courses = new ArrayList<Course>();

    public Professor(String name, int employeeId, Department department, Course course) {
        super(name, employeeId, department);
        this.addCourse(course);
    }



    public void publicCourse() {



        System.out.print(courses);

    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    // assignTA()

}

