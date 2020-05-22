package FinishedKata;

public class Kata7 {
    public static int[] getSize(int w,int h,int d) {
        int[] opt = new int[2];
        opt[0] = 2 * (w * h) + 2 * (w * d) + 2 * (h * d);
        opt[1] = w * h * d;
        return opt;
    }
}
