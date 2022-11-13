package main;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Exam> exams = new ArrayList<>();
    private Project project;


    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public ArrayList<Course> getCourses() {

        return courses;
    }

    public String getName() {
        return name;
    }

    public Project getProject() {
        
        return project;
    }

    public void addProject(Project project){
        this.project = project;
        project.addMember(this);
    }

    public void addExam(Exam exam){

        exams.add(exam);
    }

    public void addCourses(Course course) {
            courses.add(course);
    }
}
