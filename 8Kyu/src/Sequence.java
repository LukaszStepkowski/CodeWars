import java.util.Collections;
import java.util.stream.IntStream;

public class Sequence {
    public static int[] reverse(int n){
        return IntStream.rangeClosed(1, n)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
    }
}
