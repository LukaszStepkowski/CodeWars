import java.math.BigDecimal;
import java.math.MathContext;

public class GrassHopper2 {
    public static String weatherInfo(int fahrenheit) {
        BigDecimal celsius = convertToCelsius(fahrenheit);

        if (celsius.compareTo(new BigDecimal(0)) <= 0) {
            return (celsius.doubleValue() + " is freezing temperature");
        }

        return (celsius.doubleValue() + " is above freezing temperature");
    }

    public static BigDecimal convertToCelsius(int fahrenheit) {
        return new BigDecimal((fahrenheit - 32) * 5)
                .divide(new BigDecimal(9), MathContext.DECIMAL128);
    }
}
