package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.allMatch.practiceQuestions.question1;

public class Employee {
    // fields
    private int empId;
    private String name;
    private double salary;
    private String status;

    // Parameterized Constructor
    public Employee(int empId, String name, double salary, String state){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.status = state;
    }
    // Getter and Setter Methods

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Override toString()
    @Override
    public String toString(){
        return "Employee [EmpId: " + this.empId + ", Name: " + this.name + ", Salary: " + this.salary +", Status: " + this.status + "]";
    }
}
