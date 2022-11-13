package main;

import java.util.ArrayList;

public class Course {
  private int id;
  private String name;
  private int maxCapacity;
  private ArrayList<TA> tas = new ArrayList<>();
  private ArrayList<Professor> professors = new ArrayList<>();
  private boolean maxProfCap = professors.size() >= 3;
  private ArrayList<Student> students = new ArrayList<>();
  private boolean isFull = students.size() >= maxCapacity;

  public Course(int id, String name, int cap, Professor prof) {
    this.id = id;
    this.name = name;
    this.maxCapacity = cap;
    this.professors.add(prof);

  }

  public ArrayList<TA> getTas() {
    return tas;
  }

  public void setTas(ArrayList<TA> tas) {
    this.tas = tas;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Professor> getProfessors() {
    return professors;
  }

  public void enroll(Student student) {
    if (!isFull) {
      students.add(student);
    } else {
      System.out.println("Kurs ist voll");
    }
  }

  public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
  }

  public void apply(TA ta) {
    tas.add(ta);
  }
}
