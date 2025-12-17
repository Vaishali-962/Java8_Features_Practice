/*
1. Find the maximum number from a list of integers.
 */
package day8_streamAPIs_map_min_max_methods.interviewQuestions.question1;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
public class FindMaxInteger {
    public static void main(String[] args) {
        // Step 1: Create the list of integers
        List<Integer> numberList = new ArrayList<>();
        // Step 2: Add numbers (elements) to it.
        numberList.add(293);
        numberList.add(90);
        numberList.add(828);
        numberList.add(400);
        numberList.add(24);
        // Step 3: Create the stream, compare the data
        Comparator<Integer> intComparator = (num1, num2) -> Integer.compare(num1, num2);
        numberList
                .stream()
                .filter(Objects:: nonNull)
                .max(intComparator)
                .ifPresent(System.out :: println);
    }
}
