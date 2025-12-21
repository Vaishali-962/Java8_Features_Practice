package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindRepetitiveEntriesUsingStream {

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



    }

    public static List<String> findRepetitiveEntriesUsingStream(List<String> cities) {

        return cities.stream()
                .collect(Collectors.groupingBy(city -> city, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
