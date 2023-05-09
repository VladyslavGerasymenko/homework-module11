package task1;

import java.util.Arrays;
import java.util.List;

public class OddNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Igor", "Oleg", "Peter", "Anna", "Bill", "John", "Alex");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i += 2) {
            result.append(i + 1).append(". ").append(names.get(i));
            if (i < names.size() - 2) {
                result.append(", ");
            }
        }
        String formattedNames = result.toString();
        System.out.println(formattedNames);
    }
}

