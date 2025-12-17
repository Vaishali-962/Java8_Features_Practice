/*
Program for sort data based on employee salary.Without Using Stream API
 */
package day7_streamAPIs_and_sorting_n_collect_method.notesQuestions.question3;
import java.util.Set;
import java .util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        // Step 1: Create the collection (Set)
        Set<Employee> employeeSet = new HashSet<Employee>();
        // Step 2: Add data
        employeeSet.add(new Employee(19, "Vasant",900.20));
        employeeSet.add(new Employee(16, "Varsha",400.20));
        employeeSet.add(new Employee(13, "Hemant",500.20));
        employeeSet.add(new Employee(11, "vitthal",100.20));
        employeeSet.add(new Employee(12, "Mohan",1000.20));
        // Step 3: Print data
        System.out.println("--------------*** Before Sorting ***--------------");
        employeeSet.forEach(System.out::println);
        System.out.println("--------------*** Natural Sorting ***--------------");
        Comparator<Employee> idComparator1 = (emp1, emp2) -> Double.compare(emp1.getSalary(),emp2.getSalary());
        // Step 4: Natural Sorting
        Set<Employee> sortedEmployeeList = employeeSet
                .stream()
                .filter(Objects::nonNull)
                .sorted((idComparator1))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        sortedEmployeeList.forEach(System.out::println);
        // Step 5: Reverse Sorting
        System.out.println("--------------*** Reverse Sorting ***--------------");
        Comparator<Employee> idComparator2 = (emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary());
        Set<Employee> reversedEmployeeSet = employeeSet
                .stream()
                .filter(Objects::nonNull)
                .sorted(idComparator2)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        reversedEmployeeSet.forEach(System.out::println);


    }
}
