package FinishedKata;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        Integer i = 0;
        switch (rating.toLowerCase()){
            case "terrible":
                return 0;
            case "poor":
                return i = (int)(Math.ceil(amount * 0.05));
            case "good":
                return i = (int)(Math.ceil(amount * 0.1));
            case "great":
                return i = (int)(Math.ceil(amount * 0.15));
            case "excellent":
                return i = (int)(Math.ceil(amount * 0.2));
            default:
                return null;
        }
    }
}
