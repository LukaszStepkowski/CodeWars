package FinishedKata;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {
        String[] opt = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            opt[i] = arr[arr.length - 1 - i];
        }
        return opt;
    }
}
