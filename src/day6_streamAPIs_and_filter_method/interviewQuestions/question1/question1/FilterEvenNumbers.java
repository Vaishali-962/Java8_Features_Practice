/*
 Given a list of integers,
 filter the even numbers. Arrays.asList(1, 2, 3, 4, 5, 6);
 */
package day6_streamAPIs_and_filter_method.interviewQuestions.question1.question1;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class FilterEvenNumbers {
    public static void main(String[] args) {
        // Step 1: Create the list of Integer
        List<Integer> numberList = new ArrayList<>();
        // Step 2: Add numbers to list
        numberList.add(1);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(2);
        // Step 3: Write the logic to filter
        Predicate<Integer> integerPredicate = (number) -> number % 2 == 0;
        // Step 4: Create the StreamAPI, filter the data, store the result
        List<Integer> sortedNumberList =
                numberList
                        .stream()
                        .filter(integerPredicate)
                        .sorted()
                        .collect(Collectors.toList());
        //Printing
        System.out.println("------*** Original Number List ***------");
        numberList.forEach(System.out::println);
        System.out.println("------*** Filtered Number List ***------");
        sortedNumberList.forEach(System.out::println);
        System.out.println("------*** -------------------- ***------");
    }
}
