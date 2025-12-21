package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.allMatch.notesQuestions.question1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Objects;
public class Test2 {
    public static void main(String[] args) {
        // Step1: Create the collection
        Set<Employee> employeeSet = new TreeSet<Employee>(Comparator.comparing(Employee::getSalary));
        // Step2: Add employees data to the set
        employeeSet.add(new Employee(829,"Kartikeya", 207.50));
        employeeSet.add(new Employee(232,"Krishna", 103.50));
        employeeSet.add(new Employee(209,"Kunal", 223.50));
        employeeSet.add(new Employee(293,"Keshav", 908.50));
        employeeSet.add(new Employee(628,"Kaveri", 302.50));
        employeeSet.add(new Employee(727,"Kalyani", 202.50));
        employeeSet.add(new Employee(128,"Kumari", 123.50));
        // StreamAPI
        boolean result = employeeSet
                .stream()
                .filter(Objects::nonNull)
                .allMatch(emp-> emp.getName().startsWith("K"));

        System.out.println(result);
    }
}
