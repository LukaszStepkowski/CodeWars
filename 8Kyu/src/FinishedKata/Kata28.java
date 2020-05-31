package FinishedKata;

public class Kata28 {
    static String noSpace(final String x) {
        return x.join("", x.split("\\s+"));
    }
}
