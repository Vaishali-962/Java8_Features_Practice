package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.findAny;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
         //Step1: Create the list
        List<Employee> employeeList = new ArrayList<>();
        // Step2: Add data
        employeeList.add(new Employee(11,"Hemant", "Innovation"));
        employeeList.add(new Employee(12,"Varsha", "HR"));
        employeeList.add(new Employee(13,"Vasant", "Finance"));
        employeeList.add(new Employee(14,"Kishor", "Legal"));
        employeeList.add(new Employee(15,"Nikhil", "Innovation"));
        employeeList.add(new Employee(10,"Mukesh", "HR"));
        employeeList.add(new Employee(19,"Mukund", "HR"));
        employeeList.add(new Employee(17,"Kishori", "Legal"));
        // Step3: StreamAPI -> count the total employees
        long count = employeeList.stream().filter(Objects::nonNull).count();
        System.out.println("Total no of employees in company ::"+ count);
        // Step4: StreamAPI -> count the total employees from 1 department
        long count2 = employeeList
                .stream()
                .filter(Objects::nonNull)
                .filter(e-> e.getDepartment().equals("HR"))
                .count();
        System.out.println("Total number of employees from HR :: "+ count2);
        // Step5: StreamAPI -> get any one employee from the list
        employeeList.stream().filter(Objects::nonNull).findAny().ifPresent(System.out::println);

//        Step6: StreamAPI -> get any one employee from the list for particular department
        Employee employee = employeeList
                .stream()
                .filter(Objects::nonNull)
                .filter(e->e.getDepartment().equals("Innovation"))
                .findAny()
                .orElse(new Employee(0, "null", "null"));
        System.out.println("Employee from Innovation team :: " + employee);

        // Step7: parallelStream and findAny
        Employee employee1 = employeeList
                .parallelStream().filter(Objects::nonNull)
                .findAny()
                .orElse(null);
        System.out.println(employee1);

        Employee employee2 = employeeList
                .parallelStream()
                .filter(Objects::nonNull)
                .filter(e-> e.getDepartment().equals("Legal"))
                .findAny().orElse(null);
        System.out.println(employee2);
    }
}
