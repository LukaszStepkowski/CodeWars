package FinishedKata;

public class Kata8 {
    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++){
            if (haystack[i] != null && haystack[i].equals("needle")){
                index = i;
            }
        }
        return "found the needle at position " + index;
    }
}
