package FinishedKata;

import java.util.Arrays;
import java.util.Comparator;

public class Kata19 {
    public static int sum(int[] numbers) {
        return (numbers == null || numbers.length <= 1) ? 0 : Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder()).skip(1)
                .sorted().skip(1)
                .mapToInt(i -> i)
                .sum();
    }
}
