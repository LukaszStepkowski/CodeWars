import java.util.ArrayList;
import java.util.List;

public class ZywOo4 {
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> opt = new ArrayList<>();
        for (int i = 1; i < array.length; i++){
            if (array[i] % i == 0){
                opt.add(array[i]);
            }
        }
        return opt.stream().mapToInt(i -> i).toArray();
    }
}
