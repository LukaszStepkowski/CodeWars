public class StringUtils {
    public static boolean isDigit(String s) {
       return (s.matches("\\d") && Integer.valueOf(s) < 10) ? true : false;
    }
}
