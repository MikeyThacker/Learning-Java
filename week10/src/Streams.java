import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Streams {
    static void nonStreamExample() {

        // Create List of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Create new empty list to store uppercase names
        List<String> upperNames = new ArrayList<>();
        for (String name : names) { // for name in names
            // Add uppercase name to uppercase list
            upperNames.add(name.toUpperCase());
        }
        System.out.println(upperNames);
        // Output: [ALICE, BOB, CHARLIE]
    }

    static void streamExample() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upper = names.stream(). // Create stream of items in names
                map(String::toUpperCase). // map toUpperCase() function to list (on each element)
                toList(); // collect (group) into new list (upper)

        // Print new list
        System.out.println(upper);
    }

    static void filter() {
        List<String> strings = Arrays.asList("Hello", "", "World", "", "!");
        // User filter with method reference to exclude empty strings
        List<String> nonEmptyStrings = strings.stream(). // make stream of list 'strings'
                filter(String::isEmpty). // Filter out empty strings
                toList(); // collect in list

        System.out.println(nonEmptyStrings);
    }

    static void sorted() {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);

        List<Integer> sortedNumbers = numbers.stream(). // Create stream
                sorted(). // sort elements
                toList(); // collect in list

        System.out.println(sortedNumbers);
    }

    static void reduce() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream(). // Create stream
                reduce(0, Integer::sum); // sum all numbers

        System.out.println(sum);
    }

    static void forEach() {
        Map<Integer, String> map = Map.of(1, "Alice", 2, "Bob", 3, "Charlie");
        map.forEach((key, value) -> System.out.println(key + ": " + value));
        // Print each key and element in map
    }

    void Advantages() {
        /*
        Conciseness: Reduces boilerplate code especially in java
            boilerplate code - section of code that can be reused in multiple places with
                little or no modification
        Readability: Streams are more declarative, easier to understand. It can be read
            in a more "natural" format
        Parallelism: Allows for effortless parallel data processing
         */
    }

    void commonPitfalls() {
        /*
        Running multiple terminal operations can cause exceptions
        Misusing infinite streams
        Forgetting laziness of intermediate operations
         */
    }



    public static void main(String[] args) {
        nonStreamExample();
        streamExample();
        filter();
        sorted();
        reduce();
        forEach();


    }
}
