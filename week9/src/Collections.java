import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;


public class Collections {
    void Collections() {
        /*
        Collections are ways to store and manipulate groups of objects
        e.g., an Array is a collection
        Collections provide storage and access in a more structured way
        Collections allow for features such as:
            Dynamic resizing
            Built-in methods
            More efficient data handling
         */
    }

    void keyInterfaces() {
        /*
        List
        Elements are stored in a specific sequence, maintaining their insertion order
        Duplicates are allowed
        Elements are accessed via their position in the list
        Common methods:
            add(element),
            get(index),
            remove(index),
            indexOf(element),
        e.g., ArrayList

        Set
        Elements are not stored in any order,
        No duplicates
        provides operations for set theory (union, intersection)
        Common methods:
            add(element),
            contains(element),
            remove(element),
        e.g., HashSet

        Map
        Each entry is a combination of a key and its associated value
        Keys are unique, but values can be duplicated
        Provides efficient lookups and modifications by key
        Common methods:
            put(key, value), - Inserts or updates a key-value pair
            get(key), - Retrieves the value associated with the key
            remove(key), - Removes the key-value pair for specified key
            containsKey(key), - Checks if the map contains the specified key
            keySet(), - Returns a set of all keys in map
        e.g., HashMap
         */
    }

    static void arrayList() {
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Alice"); // Duplicates are allowed
        studentNames.add("Charlie");

        System.out.println("Student names: " + studentNames);

        System.out.println("First student: " + studentNames.get(0));

        studentNames.remove("Alice"); // Only removes first instance of Alice in ArrayList
        System.out.println("After removal: " + studentNames);
    }
    static void hashSet() {
        HashSet<String> studentNames = new HashSet<>();

        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Alice"); // Duplicates will be ignored
        studentNames.add("Charlie");

        System.out.println("Student names: " + studentNames);

        System.out.println("Is Alice enrolled? " + studentNames.contains("Alice"));

        studentNames.remove("Bob");
        System.out.println("After removal: " + studentNames);
    }

    static void hashMap() {
        HashMap<Integer, String> studentData = new HashMap<>();

        studentData.put(1001, "Alice");
        studentData.put(1002, "Bob");
        studentData.put(1003, "Charlie");
        studentData.put(1004, "Alice"); // Duplicate values are allowed, but keys must be unique

        System.out.println("Student data: " + studentData);

        System.out.println("Student with ID 1001: " + studentData.get(1001));

        studentData.remove(1002);
        System.out.println("After removal: " + studentData);
    }

    public static void main(String[] args) {
        arrayList();
        System.out.println("----------------");

        hashSet();
        System.out.println("----------------");

        hashMap();


    }
}
