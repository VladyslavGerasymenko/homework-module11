package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedNumbers {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        String result = sortAndJoin(arr);
        System.out.println(result);
    }

    public static String sortAndJoin(String[] arr) {
        List<Integer> numbers = new ArrayList<>();

        for (String s : arr) {
            String[] parts = s.split(", ");
            for (String part : parts) {
                int n = Integer.parseInt(part);
                numbers.add(n);
            }
        }

        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
            if (i != numbers.size() - 1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
