import java.util.Arrays;
import java.util.Collections;

public class ZywOo5 {
    public static int sumOfDifferences(int[] arr) {
        int sum = 0;
        if (arr.length <= 1) return 0;
        int[] temp = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();
        for (int i = 1; i < temp.length; i++){
            sum += temp[i - 1] - temp[i];
        }
        return sum;
    }
}
