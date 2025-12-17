/*
Que 4: Convert a List of Integers to Their Squares
 */
package day8_streamAPIs_map_min_max_methods.interviewQuestions.question4;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.function.BiConsumer;


public class GetSquareOfInt {
    public static void main(String[] args) {
        // Step 1: Create a list of integersList
        List<Integer> integersList = new ArrayList<>();
        // Step 2 : Add data to list
        integersList.add(3);
        integersList.add(6);
        integersList.add(5);
        integersList.add(7);
        integersList.add(null);

        // Step3 : write the logic for the task
        Function<Integer, Integer> integerFunctionForSquare = (num) ->num * num;

        ///  Step4 : Write the SteamAPI
        List<Integer> squareOfIntValues = integersList
                .stream()
                .filter(Objects:: nonNull)
                .map(integerFunctionForSquare)
                .collect(Collectors.toList());

        // Remove null values for the integerList
        Iterator<Integer> itr = integersList.iterator();
        while(itr.hasNext()){
            if(itr.next() == null){
                itr.remove();
            }
        }
        // Adding integer, and it's square as key-> value pair
        Map<Integer, Integer> integerAndSquare = new TreeMap<>();
        for(int i = 0; i < integersList.size(); i++){
            integerAndSquare.put(integersList.get(i), squareOfIntValues.get(i));
        }

        // Write the BiConsumer function
        BiConsumer<Integer,Integer> biConsumer = (integer, square) -> {
            System.out.println("| " + integer + "  ->  "+ square + "  |");
        };

        // Printing it
        System.out.println("---------------");
        integerAndSquare.forEach((biConsumer));
        System.out.println("---------------");
    }
}
