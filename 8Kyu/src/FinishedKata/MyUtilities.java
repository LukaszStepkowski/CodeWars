package FinishedKata;

public class MyUtilities {
    public boolean isDigit(String s) {
        if (s == null){
            return false;
        }
        try {
            double d = Double.parseDouble(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
