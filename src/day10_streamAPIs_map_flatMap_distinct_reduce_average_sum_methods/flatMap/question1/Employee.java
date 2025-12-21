package day10_streamAPIs_map_flatMap_distinct_reduce_average_sum_methods.flatMap.question1;
import java.util.List;
// Employee Class
public class Employee {
    // Fields
    private Long id;
    private String name;
    private String department;
    private Double Salary;
    private Integer age;
    private String address;
    private String state;
    private List<String> skill;
    // Constructors

//    public Employee() {
//    }

    public Employee(Long id, String name, String department, Double salary, Integer age, String address, String state, List<String> skill) {
        this.id = id;
        this.name = name;
        this.department = department;
        Salary = salary;
        this.age = age;
        this.address = address;
        this.state = state;
        this.skill = skill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }
// Overridden toString


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", Salary=" + Salary +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", skill=" + skill +
                '}';
    }
}
