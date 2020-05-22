package FinishedKata;

public class Kata2 {
    public static int[] digitize(long n) {
        String temp = String.valueOf(n);
        String[] strArr = temp.split("");
        int[] opt = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++){
            opt[i] = Integer.parseInt(strArr[strArr.length - i - 1]);
        }
        return opt;
    }
}