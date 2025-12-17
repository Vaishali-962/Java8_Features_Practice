/*
Question: Find the Shortest String in a List
 */
package day8_streamAPIs_map_min_max_methods.interviewQuestions.question6;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class FindShortestStringInList {
    public static void main(String[] args) {
        // Step 1: Create the list
        List<String> citiesNameList = new ArrayList<>();
        // Step2: Add elements to the list
        citiesNameList.add("Guwahati");
        citiesNameList.add("Visakhapatnam");
        citiesNameList.add("Mumbai");
        citiesNameList.add("Amaravati");
        citiesNameList.add("Itanagar");
        citiesNameList.add("Kohima");
        citiesNameList.add("Pune");
        // Step3: find the shortest String
        Comparator<String> stringComparator = (city1, city2) -> Integer.compare(city1.length(),city2.length());
        citiesNameList
                .stream()
                .min(stringComparator)
                .ifPresent(System.out :: println);
    }
}
