package FinishedKata;

import java.text.DecimalFormat;

public class Kata26 {
    public static double fuelPrice(int litres, double pricePerLiter) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.valueOf(df.format(litres * ((litres >= 10) ? pricePerLiter - 0.25
                : (litres >= 8) ? pricePerLiter - 0.2
                : (litres >= 6) ? pricePerLiter - 0.15
                : (litres >= 4) ? pricePerLiter - 0.1
                : (litres >= 2) ? pricePerLiter - 0.05 : pricePerLiter)));
    }
}
