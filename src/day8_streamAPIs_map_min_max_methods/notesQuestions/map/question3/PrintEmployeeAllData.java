/*
Write a program to print all employee’s data into List
 */
package day8_streamAPIs_map_min_max_methods.notesQuestions.map.question3;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Objects;

public class PrintEmployeeAllData {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<Employee> employeesList = new ArrayList<>();
        // Step 2: Add employees details to list
        employeesList.add(new Employee(101, "Vishal", 9000.30));
        employeesList.add(new Employee(105, "Makarand", 15000.39));
        employeesList.add(new Employee(102, "Vitthal", 6000.30));
        employeesList.add(new Employee(108, "Rukhmini", 12000));
        employeesList.add(new Employee(107, "Bharat", 7000.39));
       // Create the SteamAPI and collect it to the other object
        List<Employee> empList = employeesList
                .stream()
                .map((employee) -> employee)
                .collect(Collectors.toList());
        // Print the new list
        empList.forEach(System.out :: println);
        System.out.println("=========================================");

        // Created sorted list using empId
        // logic
//        Comparator<Employee> IdComparator = (employee1, employee2) -> Integer.compare(employee1.getEmpId(),employee2.getEmpId());

        // Creating StreamAPI and storing the data
        List<Employee> sortedEmployeeList = employeesList
                .stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Employee :: getEmpId))
                .collect(Collectors.toList());

        // Printing the sortedEmployeeList
        sortedEmployeeList.forEach(System.out::println);
        System.out.println("=========================================");
    }
}
