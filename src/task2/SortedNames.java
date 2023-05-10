package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNames {

    public static List<String> getSortedUpperCase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Igor", "Oleg", "Peter", "Anna", "Bill", "John", "Alex");
        List<String> result = getSortedUpperCase(names);
        System.out.println(result);
    }

}


