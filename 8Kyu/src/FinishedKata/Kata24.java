package FinishedKata;

import java.util.Arrays;

public class Kata24 {
    public static double find_average(int[] array){
        return Arrays.stream(array)
                .average()
                .getAsDouble();
    }
}
