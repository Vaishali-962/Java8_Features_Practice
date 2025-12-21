package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.findFirst.classNotesQuestions.question2.parellelStream;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.stream.IntStream;
public class Test2 {
    public static void main(String[] args) {
        // Create parallel stream
        IntStream stream = IntStream.of(4,3,6,8,12,15,16,18,20).parallel();
        System.out.println(stream);
        System.out.println("------------------------------");
        // Stream findAny() method with parallel stream
        stream = stream.filter(Objects:: nonNull).filter(n-> n%4==0);
        System.out.println(stream);
        System.out.println("------------------------------");
        OptionalInt answer = stream.findAny();

        if(answer.isPresent()){
            System.out.println(answer.getAsInt());
        }
        System.out.println("------------------------------");
    }
}
