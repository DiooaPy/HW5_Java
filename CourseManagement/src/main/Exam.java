package main;

import java.util.ArrayList;

public class Exam {
    private int maxValue;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Question> questions = new ArrayList<>();

    public void addQuestion(int id, String task, int value){
        if(value > maxValue){
            System.out.println("zu großer Wert");
        }else{
            questions.add(new Question(id, task, value));
            this.maxValue=+ value;
        }
        
    }

    public boolean register(Student student){
        students.add(student);
        return true;
    }

    public Student[] getRegisteredStudents(){
        Student[] students_array = students.toArray(new Student[students.size()]);
        return students_array;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }





 private class Question{

        private String task;
        private int maxValue;
        private int id;

    


    public Question(int id, String task, int value){
        setId(id);;
        setTask(task);;
        setMaxValue(value);;
    }


    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }






 }





















}
