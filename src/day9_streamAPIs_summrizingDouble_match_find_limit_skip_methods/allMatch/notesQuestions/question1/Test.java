package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.allMatch.notesQuestions.question1;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

// Task : Check if all employees name starts with "K"
public class Test {
    public static void main(String[] args) {
        // Step1: Create the collection
        Set<Employee> employeeSet = new TreeSet<Employee>(Comparator.comparing(Employee::getSalary));
        // Step2: Add employees data to the set
        employeeSet.add(new Employee(829,"Hemant", 207.50));
        employeeSet.add(new Employee(232,"Krishna", 103.50));
        employeeSet.add(new Employee(209,"Kunal", 223.50));
        employeeSet.add(new Employee(293,"Keshav", 908.50));
        employeeSet.add(new Employee(628,"Kaveri", 302.50));
        employeeSet.add(new Employee(727,"Kalyani", 202.50));
        employeeSet.add(new Employee(128,"Mukesh", 123.50));
        // Step3: Logic
        boolean checkResult = employeeSet
                .stream()
                .filter(Objects::nonNull)
                .allMatch((emp)->emp.getName().startsWith("K"));

        System.out.println(checkResult);
    }
}
