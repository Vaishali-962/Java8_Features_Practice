package day9_streamAPIs_summrizingDouble_match_find_limit_skip_methods.summerizingDouble.question1.notesQuestion;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        // Step1: Create the collections
        List<Students> studentList = new ArrayList<>();
        // Step2: Add elements
        studentList.add(new Students(1,"", 90,82,83));
        studentList.add(new Students(3,"", 70,89,80));
        studentList.add(new Students(4,"", 40,83,82));
        studentList.add(new Students(2,"", 60,90,86));
        // Step3: logic

        // Step4: StreamAPI
        DoubleSummaryStatistics collect = studentList.stream().collect(Collectors.summarizingDouble(Students::getStudentId));
        System.out.println(collect);
    }

}
