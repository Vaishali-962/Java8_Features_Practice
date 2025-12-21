package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.count.question1;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

//program for average of employee

public class Test {
    public static void main(String[] args) {
        // Step1: Create the collection
        List<Employee> employeeList = new ArrayList<Employee>();
        // Step2: Add data to list
        employeeList.add(new Employee(101,"Aakash", 50000));
        employeeList.add(new Employee(108,"Raju", 42000));
        employeeList.add(new Employee(103,"Sunil", 40330));
        employeeList.add(new Employee(104,"Hemant", 40923));
        // Step3: StreamAPI
        long count = employeeList.stream().filter(Objects::nonNull).count();
        System.out.println("Total No. of Employees :: "+count);

        // Find total no of Employees whose salary is greater than 45,000;
        long employeeCount1 = employeeList.stream().filter(p->p.getSalary() >=42_000).count();
        System.out.println("No. of Employees with slab of 42k :: " + employeeCount1);
    }
}
