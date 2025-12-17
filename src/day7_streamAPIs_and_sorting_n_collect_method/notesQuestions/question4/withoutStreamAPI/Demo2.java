/*
Program for sort data based on employee name. Without Using Stream API-
 */
package day7_streamAPIs_and_sorting_n_collect_method.notesQuestions.question4.withoutStreamAPI;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Demo2 {
    public static void main(String[] args) {
        // Step 1: Create the collection (Set)
        List<Employee> employeeList = new ArrayList<>();
        // Step 2: Add data
        employeeList.add(new Employee(19, "Vasant",900.20));
        employeeList.add(new Employee(16, "Varsha",400.20));
        employeeList.add(new Employee(13, "Hemant",500.20));
        employeeList.add(new Employee(11, "vitthal",100.20));
        employeeList.add(new Employee(12, "Mohan",1000.20));
        // Step 3: Print data
        System.out.println("--------------*** Before Sorting ***--------------");
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
        System.out.println("--------------*** Natural Sorting  Based On Employee Name ***--------------");
        // Step 4: Sorting
        Comparator<Employee> namecomparator = (emp1, emp2) ->emp1.getName().compareToIgnoreCase(emp2.getName());
        employeeList.sort(namecomparator);
        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
