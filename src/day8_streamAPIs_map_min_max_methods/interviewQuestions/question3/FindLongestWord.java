package day8_streamAPIs_map_min_max_methods.interviewQuestions.question3;
import java.util.*;

/*
3. Find the longest word in a sentence using Streams
=> String sentence = "Java Stream API is very powerful";
 */
public class FindLongestWord {
    public static void main(String[] args) {
        // Given String
        String sentence = "Java Stream API is very powerful";

//        String[] arr = sentence.split(" ");
//        for (String s : arr) {
//            System.out.println(s);
//        }
        // Step 1 : Convert the String into List
        // 1.sentence.split(" ") ->gives Array -> convert this array into List using -> Arrrays.asList
        // -> store it as ArrayList
        List<String> wordList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
//        wordList.forEach(System.out::println);

        // Step 2: Create the StreamAPI and find the longest
        Comparator<String> stringComparator = (str1, str2) -> Integer.compare(str1.length(), str2.length());

//        List<String> longestWord =
        wordList
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(String::length))
                .ifPresent(System.out :: println);

    }
}
