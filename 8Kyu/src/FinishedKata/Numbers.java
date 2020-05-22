package FinishedKata;

import java.text.DecimalFormat;

public class Numbers {
    public static double TwoDecimalPlaces(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.valueOf(df.format(number)).doubleValue();
    }
}
