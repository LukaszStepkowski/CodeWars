import java.util.Arrays;

public class Kata30 {
    public static int[] squareOrSquareRoot(int[] array)
    {
        int[] opt = new int[array.length];
        for (int i = 0; i < array.length; i++){
            double temp = Math.sqrt(array[i]);
            if (temp - Math.floor(temp) == 0) {
                opt[i] = (int)temp;
            } else opt[i] = (int)Math.pow(array[i], 2);
        }
        return opt;
    }
}
