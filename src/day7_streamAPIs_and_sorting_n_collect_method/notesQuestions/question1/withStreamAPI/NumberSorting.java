/*
Program for sorting element based on ascending and descending order With Using Stream API
 */
package day7_streamAPIs_and_sorting_n_collect_method.notesQuestions.question1.withStreamAPI;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class NumberSorting {
    public static void main(String[] args) {
        // Step 1: Create the collection
        List<Integer> numberList = new ArrayList<Integer>();
        // Step 2: Add elements to the collection
        numberList.add(2);
        numberList.add(9);
        numberList.add(7);
        numberList.add(3);
        numberList.add(1);
        // Step 3: Comparison Logic
        Comparator<Integer> integerComparator1 = (number1, number2) -> number1.compareTo(number2);
        System.out.println("--------------*** Before Sorting ***--------------");
        numberList.forEach(System.out::println);
        System.out.println("--------------*** Sorting ***--------------");
        // Step 4: StreamAPI creation and printing the data
        numberList
                .stream()
                .filter(Objects::nonNull)
                .sorted()
                .forEach(System.out::println);

        System.out.println("--------------*** Reverse Sorting ***--------------");
        Comparator<Integer> integerComparator2 = (num1, num2)-> num2.compareTo(num1);
        numberList
                .stream()
                .filter(Objects::nonNull)
                .sorted(integerComparator2)
                .forEach(System.out::println);
        System.out.println("--------------*** After Sorting ***--------------");
        numberList.forEach(System.out::println);
    }
}
