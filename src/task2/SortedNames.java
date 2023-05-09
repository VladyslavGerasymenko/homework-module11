package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedNames {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Igor");
        names.add("Oleg");
        names.add("Peter");
        names.add("Anna");
        names.add("Bill");
        names.add("John");
        names.add("Alex");
        List<String> result = sortAndUpper(names);
        System.out.println(result);
    }

    public static List<String> sortAndUpper(List<String> names) {
        names.replaceAll(String::toUpperCase);

        names.sort(Collections.reverseOrder());

        return names;
    }
}

