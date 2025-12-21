package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.anyMatch.notesQuestions.question1;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;
public class Test2 {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<Employee> employeeList = new ArrayList<>();

        // Step 2: Add the elements
        employeeList.add(new Employee(11,"Vasant",1000.30));
        employeeList.add(new Employee(12,"Varsha",1000.30));
        employeeList.add(new Employee(13,"Vaishali",1000.30));
        employeeList.add(new Employee(14,"Vimala",1000.30));
        // Step 3: StreamAPI
        // allMatch
        boolean resultForallMatch = employeeList.stream().filter(Objects::nonNull).allMatch((p)->p.getName().startsWith("V"));
        System.out.println("Result for allMatch :: "+ resultForallMatch);

        // anyMatch
        boolean resultForAnyMatch = employeeList.stream().filter(Objects::nonNull).anyMatch(p -> p.getName().startsWith("V"));
        System.out.println("Result for allMatch :: "+ resultForAnyMatch);
    }
}
