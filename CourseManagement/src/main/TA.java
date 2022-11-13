package main;

import java.util.ArrayList;

public class TA {

    public ArrayList<Course> ta_Courses = new ArrayList<Course>();
    public String name;
    public boolean contracted = ta_Courses.size() >= 1;

    public TA(String name, Course firstcourse) {

        ta_Courses.add(firstcourse);

        setName(name);


    }

    public ArrayList<Course> getTa_Courses() {
        return ta_Courses;
    }

    public void extendContract(Course course) {
        ta_Courses.add(course);
    }
  
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
