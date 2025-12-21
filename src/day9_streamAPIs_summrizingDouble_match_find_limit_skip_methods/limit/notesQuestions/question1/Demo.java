package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.limit.notesQuestions.question1;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

//  Program to use of limit ()
public class Demo {
    public static void main(String[] args) {
        // Step1 : Create the list
        List<String> names = new ArrayList<String>();
        // Step2 : Adding elements to the list
        names.add("Vasant");
        names.add(null);
        names.add("Ruhika");
        names.add("Parul");
        names.add("Nikita");
        names.add("Ruhika");
        // printing limit
        System.out.println(names.stream().limit(3));

        // we want to get first 3 person names from the list
        names.stream().filter(Objects::nonNull).limit(3).forEach(System.out::println);

    }
}
