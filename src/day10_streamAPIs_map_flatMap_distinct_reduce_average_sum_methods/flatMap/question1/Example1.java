package day10_streamAPIs_map_flatMap_distinct_reduce_average_sum_methods.flatMap.question1;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;


public class Example1 {
    public static void main(String[] args) {
        // Create the list
        List<Employee>  employeeList = new ArrayList<>();

        // Add data
        employeeList.add(new Employee(12L,"Hemant", "IT", 45000.20, 25, "Pune", "Maharashtra", Arrays.asList("Java", "MySql", "Hibernate")));
        employeeList.add(new Employee(15L,"Vishwas", "Finance", 53000.60, 32, "Mumbai", "Maharashtra", Arrays.asList("Excel", "Accounting", "Finance")));
        employeeList.add(new Employee(19L,"Rahul", "IT", 60000.39, 56, "Pune", "Maharashtra", Arrays.asList("Java", "Angular", "SpringBoot")));
        employeeList.add(new Employee(16L,"Priya", "HR", 30000.0, 21, "Mumbai", "Maharashtra", Arrays.asList("Excel", "SPD", "Rangoli")));
        employeeList.add(new Employee(18L,"Kunal", "HR", 40000.20, 34, "Delhi", "Delhi", Arrays.asList("Excel", "SPD", "Rangoli")));
        employeeList.add(new Employee(17L,"Durga", "IT", 42000.00, 23, "Kohima", "Nagaland", Arrays.asList("Java", "React", "SpringBoot")));
        employeeList.add(new Employee(13L,"Mohit", "Finance", 49000.50, 43, "Delhi", "Delhi", Arrays.asList("Excel", "PowerBI", "Communication")));
        // Map the employees by name
        List <String> employeesNameList= employeeList
                .stream()
                .filter(Objects::nonNull)
                .map(Employee::getName)
                .collect(Collectors.toList());
        // Printing the data
        System.out.println("----***--------***----");
        employeesNameList.forEach(System.out::println);
        System.out.println("----***--------***----");
        // Increase the salary of each employee by 10%
        List<Double> increasedSalary = employeeList
                .stream()
                .filter(Objects::nonNull)
                .map(e-> e.getSalary()*1.10)
                .collect(Collectors.toList());
        // Print the increased salary
        increasedSalary.forEach(System.out::println);
        // Get the name of employees and change it to uppercase
        List<String> upperCasedEmployeeNamesList = employeeList
                .stream()
                .filter(Objects::nonNull)
                .map(e->e.getName().toUpperCase())
                .collect(Collectors.toList());
        // Print the data
        System.out.println("----***--------***----");
        upperCasedEmployeeNamesList.forEach(System.out::println);
        System.out.println("----***--------***----");
        // Get the output like this [Name -Department]
        List<String> employeeAndDepartment = employeeList
                .stream()
                .filter(Objects::nonNull)
                .map(e-> e.getName() + " - " + e.getDepartment())
                .collect(Collectors.toList());
        // Printing the data
        employeeAndDepartment.forEach(System.out::println);
        System.out.println("----***--------***----");
        // Get employess and there skills
        List<String> employeeDepartmentSkillList = employeeList.stream()
                .filter(Objects::nonNull)
                .map(e->e.getName() + " - "+ e.getDepartment() + " - " + e.getSkill())
                .collect(Collectors.toList());
        // Printing the data
        employeeDepartmentSkillList.forEach(System.out::println);
        System.out.println("----***--------***----");

        System.out.println("----***----map()----***----");
        List<List<String>> skillListByMap = employeeList
                .stream()
                .filter(Objects::nonNull)
                .map(Employee::getSkill)
                .collect(Collectors.toList());

        skillListByMap.forEach(System.out::println);
        System.out.println("----***----flatMap()----***----");

        List<String> skillListByFlatMap = employeeList.stream()
                .filter(Objects::nonNull)
                .flatMap(e-> e.getSkill().stream().map((skill)-> e.getName() + " " + skill))
                .distinct()
                .collect(Collectors.toList());

        skillListByFlatMap.forEach(System.out::println);
        System.out.println("----***------------------***----");
    }
}
