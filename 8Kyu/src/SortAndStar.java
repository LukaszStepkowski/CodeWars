import java.util.Arrays;
import java.util.Optional;

public class SortAndStar {
    public static String twoSort(String[] s) {
        Optional<String> first = Arrays.stream(s).sorted().findFirst();
        return first.get().replaceAll(".", "$0***").replaceAll("[*]+$", "");
    }
}
