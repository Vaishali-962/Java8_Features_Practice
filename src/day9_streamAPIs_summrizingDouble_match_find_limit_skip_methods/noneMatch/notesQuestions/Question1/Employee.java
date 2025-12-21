package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.noneMatch.notesQuestions.Question1;

public class Employee {
    // Fields
    private int empId;
    private String name;
    private double Salary;

    // Parameterized Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        Salary = salary;
    }

    // getter and setter methods

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
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
