package task3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortedNumbers {

    public static String getSortedNumbers(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String result = getSortedNumbers(arr);
        System.out.println(result);
    }

}

