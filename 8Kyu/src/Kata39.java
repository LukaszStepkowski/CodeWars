import java.util.Arrays;

public class Kata39 {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(i -> i * -1).toArray();
    }
}
