package FinishedKata;

public class Calculate {
    public static String bmi(double weight, double height) {
        double calculateBMI = weight / Math.pow(height, 2);
        return (calculateBMI <= 18.5) ? "Underweight" : (calculateBMI <= 25) ? "Normal"
                : (calculateBMI <= 30) ? "Overweight" : "Obese";
    }
}
