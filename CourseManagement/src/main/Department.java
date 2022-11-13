package main;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();


    public Department(String name) {
        setName(name);
    }

    public void addEmployee(Employee employee) {

        employees.add(employee);
    }

    public void addCourse(Course course) {

        courses.add(course);

    }

    static class Employee {
        private String name;
        private Department department;
        private int employeeId;

        public Employee(String name, int employeeId, Department department) {
            setName(name);
            setEmployeeId(employeeId);
            setDepartment(department);
            department.addEmployee(this);


        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }

        public int getEmployeeId() {
            return this.employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }



    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
