package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.findFirst.classNotesQuestions.question2.parellelStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Test {
    public static void main(String[] args) {
        // Step 1: Create one parellel stream
        IntStream intStream = IntStream.of(2,4,5,6,8,10,39).parallel();
        // using the Stream findAny() multiple times on parallel stream -> may not return the same value
        intStream.filter(num-> num % 2 == 0).findAny().ifPresent(System.out :: println);

    }
}
