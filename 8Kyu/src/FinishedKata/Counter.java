package FinishedKata;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean bool : arrayOfSheeps){
            if (bool == null){
                counter+=0;
            } else if (bool == true){
                counter++;
            }
        }
        return counter;
    }
}