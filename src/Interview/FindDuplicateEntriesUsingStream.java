package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateEntriesUsingStream {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Akola");
        cities.add("Amravati");
        cities.add("Akola");
        cities.add("Mumbai");
        cities.add("Nagpur");
        cities.add("Delhi");
        cities.add("Gurugram");
        cities.add("Gurugram");

        System.out.println(cities);

        // Solution 1:
        Map<String, Integer> map = new HashMap<>();
        for (String city: cities) {
            map.compute(city, (k, v) -> (v==null)? 1 : v + 1);
        }
        List<Map.Entry<String, Integer>> collect =
                map.entrySet().stream()
                        .filter(Objects::nonNull)
                        .filter(city -> {
                            return city.getValue() > 1;
                }).collect(Collectors.toList());
        System.out.println(collect);
    }
}
