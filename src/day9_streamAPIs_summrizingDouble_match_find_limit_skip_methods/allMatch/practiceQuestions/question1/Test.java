package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.allMatch.practiceQuestions.question1;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
/*
1️⃣ Employee Validation
Check whether all employees are active and have salary ≥ 40,000.
 */
public class Test {
    public static void main(String[] args) {
        // Step 1: Create the List
        List<Employee> employeeList = new ArrayList<>();
        // Step 2: Add data to list
        employeeList.add(new Employee(1, "Keshav", 49000, "Active"));
        employeeList.add(new Employee(1, "Hemant", 42000, "Active"));
        employeeList.add(new Employee(1, "Reshma", 90000, "Active"));
        employeeList.add(new Employee(1, "Sugandha", 69000, "Active"));
        employeeList.add(new Employee(1, "Durga", 45000, "Active"));
        employeeList.add(new Employee(1, "Hetal", 40000, "Active"));
        // Step 3: Logic
        Predicate<Employee> predicate = (employee) -> (employee.getSalary() >= 40_000)&&(employee.getStatus().equals("Active"));

        // Step 4: StreamAPI
        boolean result = employeeList
                .stream().filter(Objects::nonNull).allMatch(predicate);
        // Step 5: Print
        System.out.println(result);
    }
}
