package FinishedKata;

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        int moduloFlower1 = flower1 % 2;
        int moduloFlower2 = flower2 % 2;
        return  (moduloFlower1 != moduloFlower2) ? true : false;
    }

}