public class Converter {
    public static float mpgToKPM(final float mpg) {
        float mileToKilometer = 1.60934f;
        float gallonToLiter = 4.5460918f;
        float output = Math.round((mpg * mileToKilometer / gallonToLiter) * 100);
        return output / 100;
    }
}