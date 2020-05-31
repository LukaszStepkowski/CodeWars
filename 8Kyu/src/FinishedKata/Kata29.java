package FinishedKata;

import java.util.Arrays;

public class Kata29 {
    public static String well(String[] x) {
        long goodIdeas = Arrays.stream(x).filter(i -> i.equals("good")).count();
        return (goodIdeas == 0) ? "Fail!" : (goodIdeas < 3) ? "Publish!" : "I smell a series!";
    }
}
