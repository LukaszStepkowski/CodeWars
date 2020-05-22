package FinishedKata;

public class Kata5 {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = yourPoints;
        for (Integer integer : classPoints){
            sum += integer;
        }
        return yourPoints > sum / (classPoints.length + 1);
    }
}
