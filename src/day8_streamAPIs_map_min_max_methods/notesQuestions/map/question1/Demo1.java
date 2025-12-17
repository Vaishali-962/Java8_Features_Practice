package day8_streamAPIs_map_min_max_methods.notesQuestions.map.question1;
import java.util.List;
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        // Step 1: Create the Collection
        List<String> list = new ArrayList<String>();
        list.add("Naveen");
        list.add("Mahesh");
        list.add("Hemant");
        list.add("Shrijeet");
        list.add("Ganesh");

        // step 2 write a logic
//        Function<String, String> names = (name) -> name;
//        Consumer<String> consumer = (name) -> System.out.println(name);

        //  list.stream().map(names).forEach(consumer);

        list.stream().map(name -> name).forEach(System.out :: println);


    }
}
