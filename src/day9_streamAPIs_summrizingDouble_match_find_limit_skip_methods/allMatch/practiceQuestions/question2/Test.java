package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.allMatch.practiceQuestions.question2;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;
/*
Short-Circuit Test
Print each number and check whether all numbers are positive.
(Observe when execution stops.)
 */
public class Test {
    public static void main(String[] args) {
        //Step 1: Collection
        List<Integer> numberList = new ArrayList<>();
        // Step 2: Add element
        numberList.add(2);
        numberList.add(4);
        numberList.add(-1);
        numberList.add(9);
        numberList.add(10);

        // Step 3: Logic
        Predicate<Integer> integerPredicate = (num) -> {
            System.out.println(num > 0);
            return num > 0;
        };

        // Step 4: Stream API
        boolean result = numberList
                .stream()
                .filter(Objects::nonNull)
                .allMatch(integerPredicate);

        System.out.println("Final Result ::"+result);
    }
}
