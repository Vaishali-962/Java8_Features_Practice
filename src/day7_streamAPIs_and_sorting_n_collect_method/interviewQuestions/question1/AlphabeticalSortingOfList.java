/*
1. Sort a List of Strings in Alphabetical Order
 */
package day7_streamAPIs_and_sorting_n_collect_method.interviewQuestions.question1;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class AlphabeticalSortingOfList {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<String> studentsList = new ArrayList<>();
        // Step 2 : Add data
        studentsList.add("Ram");
        studentsList.add("Meera");
        studentsList.add("Hemant");
        studentsList.add("Vasant");
        studentsList.add("Amit");
        studentsList.add("Narendra");
        // Step 3: Write the logic of Comparison
        Comparator<String> stringComparator = (name1, name2)-> name1.compareToIgnoreCase(name2);

        Comparator<String> stringComparator1 = String :: compareToIgnoreCase;

        // Step 4: Create the StreamAPI, sort the data
        List<String> sortedStudentList = studentsList
                .stream()
                .filter(Objects::nonNull)
                .sorted(stringComparator1)
                .collect(Collectors.toList());

        // Step5: Printing the original and sorted Data
        System.out.println("-----*** Original Data ***-----");
        studentsList.forEach(System.out :: println);
        System.out.println("-----*** Sorted Data ***-----");
        sortedStudentList.forEach(System.out :: println);
        System.out.println("============================");



    }
}
