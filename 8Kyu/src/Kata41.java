public class Kata41 {
    public static String integrate(int coefficient, int exponent) {
        int newExponent = exponent+1;
        int newCoefficient = coefficient / newExponent;
        return "" + newCoefficient + "x^" + newExponent;
    }
}
