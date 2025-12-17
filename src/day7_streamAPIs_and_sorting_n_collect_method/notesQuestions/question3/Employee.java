package day7_streamAPIs_and_sorting_n_collect_method.notesQuestions.question3;

public class Employee {
    // fields
    private int empId;
    private String name;
    private double salary;
    // Parameterized constructor
    public Employee(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    // Getter and Setter methods

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

    // Overridden toString()
    public String toString(){
        return "Employee [EmpId: " + this.empId + ", Name: " + this.name + ", Salary: " + this.salary + "]";
    }
}
