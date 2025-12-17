/*
Write a program to print all employee names into List
 */
package day8_streamAPIs_map_min_max_methods.notesQuestions.map.question4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class printEmployeeNames {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<Employee> employeesList = new ArrayList<>();
        // Step 2: Add employees details to list
        employeesList.add(new Employee(101, "Vishal", 9000.30));
        employeesList.add(new Employee(105, "Makarand", 15000.39));
        employeesList.add(new Employee(102, "Vitthal", 6000.30));
        employeesList.add(new Employee(108, "Rukhmini", 12000));
        employeesList.add(new Employee(107, "Bharat", 7000.39));

        // logic
//        Function<Employee, String> employeeStringFunction = (employee)->employee.getName();

        // Create the SteamAPI and collect it to the other object
        List<String> employeeNameList = employeesList
                .stream()
                .filter(Objects::nonNull)
                .map(Employee :: getName)
                .sorted()
                .collect(Collectors.toList());

        // Print the sorted employee name list
        employeeNameList.forEach(System.out :: println);
    }
}
