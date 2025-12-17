/*
Question : write a program to display the number greater than 5000
 */
package day8_streamAPIs_map_min_max_methods.notesQuestions.map.question2;
import java.util.List;
import java.util.ArrayList;

public class NumberGreaterThan5000 {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<Integer> integerList = new ArrayList<Integer>();
        // Step 2: Add elements to the list
        integerList.add(90239);
        integerList.add(348);
        integerList.add(238924);
        integerList.add(2398);
        integerList.add(4009);
        // Step 3: logic
//        Function<Integer, Boolean> integerFunction = (number) -> {return number > 5000;};
        // Step 4: create StreamAPIs
        integerList.stream().map((number)->number> 7000).forEach(System.out :: println);

    }
}
