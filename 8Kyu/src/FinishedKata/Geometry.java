package FinishedKata;

import java.text.DecimalFormat;

public class Geometry {
    public static double squareArea(double A){
        DecimalFormat df = new DecimalFormat("#.##");
        double r = (2 * A) / Math.PI;
        return Double.valueOf(df.format(Math.pow(r, 2)));
    }
}
