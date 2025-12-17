/*
2. Remove null values from a list using filter.
 */
package day8_streamAPIs_map_min_max_methods.interviewQuestions.question2;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNull {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<String> statesList = new ArrayList<>();
        // Step 2: Add elements
        statesList.add("Maharashtra");
        statesList.add(null);
        statesList.add("Kohima");
        statesList.add("Itanagar");
        statesList.add(null);
        statesList.add("Panaji");
        statesList.add(null);
        System.out.println(statesList);
        System.out.println("=========================================================");
        // Step 3 : Create the stream, filter the data, store the result.
        List<String> states = statesList
                .stream()
                .filter(Objects :: nonNull)
                .collect(Collectors.toList());
        // Step 4 : Printing the result.
        states.forEach(System.out :: println);
        System.out.println("=========================================================");

    }
}
