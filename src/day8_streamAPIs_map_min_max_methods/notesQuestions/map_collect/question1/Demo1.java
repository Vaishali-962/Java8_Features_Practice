/*
 Question 1: Program to collect the elements from list
 */
package day8_streamAPIs_map_min_max_methods.notesQuestions.map_collect.question1;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Objects;
public class Demo1 {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<String> studentNamesList = new ArrayList<String>();
        // Step 2: Add elements to the list
        studentNamesList.add("Kailash");
        studentNamesList.add("Durga");
        studentNamesList.add("Ram");
        studentNamesList.add("Shyam");
        studentNamesList.add("Mohan");
        // Step 3: Create the StreamAPI store the result
        List<String> sortedNames = studentNamesList
                .stream()
                .filter(Objects::nonNull)
                .sorted()
                .collect(Collectors.toList());
        // Step 4: Printing the sorted data
        sortedNames.forEach(System.out::println);
    }

}
