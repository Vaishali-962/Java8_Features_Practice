package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.noneMatch.notesQuestions.Question1;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
// nonMatch()
public class Demo {
    public static void main(String[] args) {
        // Create the list
        List<Employee> employeeList = new ArrayList<>();
        // Adding elements
        employeeList.add(new Employee(23,"Ganesh", 5000.20));
        employeeList.add(new Employee(90,"Mahesh", 30949));
        employeeList.add(new Employee(12,"Sudhir", 30029));
        employeeList.add(new Employee(19, "Rani", 9089));
        // Want to find whether all employess have salary greater than 5000
        boolean result = employeeList
                .stream()
                .filter(Objects::nonNull)
                .noneMatch((emp)-> emp.getSalary() < 5000);

        System.out.println(result);
    }
}
