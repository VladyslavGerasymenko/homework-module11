package task4;

import java.util.stream.Stream;

public class LinearRandomGenerator {
    public static Stream<Long> generate(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 123456789L;

        Stream<Long> stream = generate(a, c, m, seed);
        stream.limit(20).forEach(System.out::println);
    }
}
