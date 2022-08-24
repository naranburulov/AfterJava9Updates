package newVersionUpdates.java9;

import java.util.*;

public class FactoryMethodsDemo {

    public static void main(String[] args) {

        //Creating unmodifiable List - BEFORE JAVA9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));
        courses.add("TS");
        System.out.println(courses);

        //Creating unmodifiable List - AFTER JAVA9
        List<String> myCourses = List.of("Java", "Spring", "Agile");

        //Creating unmodifiable Set - AFTER JAVA9
        Set<String> myProducts =Set.of("Milk", "Bread", "Butter");

        //Creating unmodifiable Map - AFTER JAVA9
        Map<String,Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV", 1),
                Map.entry("PSP",1),
                Map.entry("Chair",5)
        );






    }
}
