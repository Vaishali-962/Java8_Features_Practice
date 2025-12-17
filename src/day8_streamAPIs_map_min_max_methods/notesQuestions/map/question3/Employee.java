package day8_streamAPIs_map_min_max_methods.notesQuestions.map.question3;
// Write a program to print all employee’s data into List
public class Employee {
    // fields
    private int empId;
    private String name;
    private double salary;

    // constructor
    public Employee(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter methods for all fields
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override toString() method
    @Override
    public String toString(){
        return "Employee [EmpId: " + this.empId + ", Name: " + this.name + ", Salary: " + this.salary + "]";
    }

}
