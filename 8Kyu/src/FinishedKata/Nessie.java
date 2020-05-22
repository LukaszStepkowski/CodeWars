package FinishedKata;

import java.util.Arrays;

public class Nessie {
    public static boolean isLockNessMonster(String s){
        String[] strings = {"tree fiddy", "three fifty", "3.50"};
        return Arrays.stream(strings).anyMatch(str -> s.contains(str));
    }
}
