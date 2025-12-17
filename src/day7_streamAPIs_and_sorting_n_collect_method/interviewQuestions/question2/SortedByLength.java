/*
2. Sort a List of Strings by Their Length
 */
package day7_streamAPIs_and_sorting_n_collect_method.interviewQuestions.question2;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class SortedByLength {
    public static void main(String[] args) {
        // Step1: Create the list of Strings
        List<String> fruitsList = new ArrayList<>();
        // Step2: Add elements to the list
        fruitsList.add("Watermelon");
        fruitsList.add("Orange");
        fruitsList.add("Apple");
        fruitsList.add("Mango");
        fruitsList.add("Fig");
        fruitsList.add("Coconut");
        fruitsList.add("Banana ");
        // Step3: Write the comparison logic
        Comparator<String> stringComparator = (fruit1, fruit2)-> Integer.compare(fruit1.length(),fruit2.length());
        // Ste4 : Create the StreamAPIs, sort the data, and save it.
        List<String> sortedFruitsList = fruitsList
                .stream()
                .filter(Objects:: nonNull)
                .sorted(stringComparator)
                .collect(Collectors.toList());

        System.out.println("--------*** Original Data ***--------");
        fruitsList.forEach(System.out::println);
        System.out.println("--------*** Sorted Data ***--------");
        sortedFruitsList.forEach(System.out :: println);
    }
}
