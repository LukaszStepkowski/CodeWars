package FinishedKata;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Kata17 {
    public static long stairsIn20(int[][] stairs) {
        return 20 * Arrays.stream(stairs).
                mapToLong(i -> IntStream.of(i).sum())
                .sum();
    }
}
