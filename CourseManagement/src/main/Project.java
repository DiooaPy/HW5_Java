package main;

import java.util.ArrayList;

public class Project {
  private String name;
  private ArrayList<Student> members = new ArrayList<>();
  private Course course;

  public Project(String name, Course course) {
    setName(name);
    setCourse(course);

  }

  private void setName(String name) {
    this.name = name;
  }

  private void setCourse(Course course) {
    this.course = course;
  }

  public void addMember(Student student) {

    members.add(student);


  }

  public ArrayList<Student> getMembers() {
    return members;
  }

  public Course getCourse() {
    return course;
  }

  public String getName() {
    return name;
  }



}
