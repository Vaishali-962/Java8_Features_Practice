/*
Program for sorting element based on ascending and descending
order (Without Using Stream API)
 */
package day7_streamAPIs_and_sorting_n_collect_method.notesQuestions.question1.withoutStreamAPI;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class CharacterSorting {
    public static void main(String[] args) {
        // Step1: Create the list
        List<Character> characterList = new ArrayList<Character>();
        // Step 2: Add data
        characterList.add('q');
        characterList.add('u');
        characterList.add('e');
        characterList.add('e');
        // Step 3: Printing the original data
        System.out.println("--------------*** Before Sorting ***--------------");
        for(Character character :characterList){
            System.out.println(character);
        }
        System.out.println("--------------*** After Natural Sorting ***--------------");
        // Step 4: sorting
        Collections.sort(characterList);
        for(Character character: characterList){
            System.out.println(character);
        }
        System.out.println("--------------*** After Reverse Sorting ***--------------");
        // Step 5: Reverse Sorting
        Collections.reverse(characterList);
        Iterator<Character> itr = characterList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
