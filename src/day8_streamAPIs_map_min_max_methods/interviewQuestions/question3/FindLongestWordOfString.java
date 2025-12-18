package day8_streamAPIs_map_min_max_methods.interviewQuestions.question3;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
3. Find the longest word in a sentence using Streams
=> String sentence = "Java Stream API is very powerful";
 */
public class FindLongestWordOfString {
    public static void main(String[] args) {
        String sentence = "Java Stream API is very powerful";
        String[] words = sentence.split(" ");
//        System.out.println(words[0]);
        Map<Integer, List<String>> wordsWithLenght = new TreeMap<>();
        for (String word: words) {
            wordsWithLenght
                    .computeIfAbsent(word.length(), k-> new ArrayList<>())
                    .add(word)
            ;
        }

        System.out.println(wordsWithLenght.get(wordsWithLenght.keySet().stream().max(Integer::compareTo).orElse(0)));
    }
}
