package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.skip.notesQuestions.Example1;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        // Create the data
        List<String> names = new ArrayList<String>();
        // adding elements
        names.add("Ruhika");
        names.add("Parul");
        names.add("Nikita");
        names.add("Ruhika");

        // Printing limit
        System.out.println(names.stream().limit(3));    //Output: java.util.stream.SliceOps$1@6bc7c054

//        names.stream().filter{Comparator(limit(5).forEach(names.stream().limit(4)>>
    }
}
