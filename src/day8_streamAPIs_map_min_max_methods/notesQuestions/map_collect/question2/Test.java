/*
Print the car Brand Names
 */
package day8_streamAPIs_map_min_max_methods.notesQuestions.map_collect.question2;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // Step 1: Create the list of the cars
        List<Car> carList = new ArrayList<Car>();
        // Step 2: Adding cars to the Car list
        carList.add(new Car("Honda", "Amaze", 120_000));
        carList.add(new Car("Mahindra", "Scorpio", 1_500_000));
        carList.add(new Car("Tata", "Sierra", 1_100_000));
        carList.add(new Car("Toyota", "Fortune", 1_100_000));
        // Step 3: logic
        Function<Car,String> function = (car) -> car.getBrand();
        // Step 4:  Create StreamAPI, get the car brands and save it to another list
        List<String> carBrandsList = carList
                .stream()
                .filter(Objects::nonNull)
                .map(Car:: getBrand)
                .collect(Collectors.toList());
        // Step 5: Print the car brand names
        carBrandsList.forEach(System.out::println);
    }
}
