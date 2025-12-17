/*
5. Find the Longest String in a List  =>  List.of("apple", "banana", "kiwi");
 */

package day8_streamAPIs_map_min_max_methods.interviewQuestions.question5;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class FindLongestString {
    public static void main(String[] args) {
        // Step1: Create the list
        List<String> fruits = new ArrayList<>();
        // Step2: Add elements to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");
        // Step3: Write the comparison logic in Comparator:
        // Comparator<String> stringComparator = (fruit1, fruit2) -> Integer.compare(fruit1.length(), fruit2.length());
        // Step4: Create the Stream API

        fruits
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(String :: length))
                .ifPresent(System.out :: println);







    }
}
