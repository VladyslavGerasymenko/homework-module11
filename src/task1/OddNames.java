package task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNames {

    public static String getOddIndexNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Igor", "Oleg", "Peter", "Anna", "Bill", "John", "Alex");
        String result = getOddIndexNames(names);
        System.out.println(result);
    }

}

