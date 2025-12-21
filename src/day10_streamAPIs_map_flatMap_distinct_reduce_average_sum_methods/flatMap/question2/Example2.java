package day10_streamAPIs_map_flatMap_distinct_reduce_average_sum_methods.flatMap.question2;

import java.time.LocalDate;
import java.time.Period;

public class Example2 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate dob = LocalDate.of(2024,10,7);
        Period period = Period.between(ld, dob);
        System.out.println(period);
    }
}
