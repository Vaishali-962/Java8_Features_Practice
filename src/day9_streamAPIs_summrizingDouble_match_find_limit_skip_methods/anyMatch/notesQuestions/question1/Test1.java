package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.anyMatch.notesQuestions.question1;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Objects;
/*
Check if any employee initial start with "V"
 */
public class Test1 {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<Employee> employeeList1 = new ArrayList<>();
        // Step 2: Add element
        employeeList1.add(new Employee(20,"Vaishali",400.28));
        employeeList1.add(new Employee(21,"Bairavi",800.28));
        employeeList1.add(new Employee(22,"Hemant",700.28));
        employeeList1.add(new Employee(23,"Vasant",400.28));
        employeeList1.add(new Employee(24,"Rohit",500.28));
        // Step 3: logic
        Predicate<Employee> employeePredicate = (employee) -> employee.getName().startsWith("V");
        // Step 4: StreamAPI

        // allMatch()
        boolean allMatchResult = employeeList1.stream().allMatch(employeePredicate);
        System.out.println("Result for allMatch() :: " + allMatchResult);

        //anyMatch()
        boolean anyMatchResult = employeeList1.stream().anyMatch(employeePredicate);
        System.out.println("Result for anyMatch() :: " + anyMatchResult);
    }
}
