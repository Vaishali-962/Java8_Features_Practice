package day10_streamAPIs_map_flatMap_distinct_reduce_average_sum_methods.flatMap.question2;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
public class Example {
    public static void main(String[] args) {
        // Create the list
        List<Integer> numberList = new ArrayList<Integer>();
        // ADD elements
        numberList.add(2);
        numberList.add(3);
        numberList.add(25);
        numberList.add(20);
        numberList.add(91);
        // find the even numbers from list and save it to other stream
        List<Integer> evenNumberList = numberList
                .stream()
                .filter(Objects::nonNull)
                .filter(num ->num %2 == 0)
                .distinct()
                .collect(Collectors.toList());

        evenNumberList.forEach(System.out::println);
    }
}
