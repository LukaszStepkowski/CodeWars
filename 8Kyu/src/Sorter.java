import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static List<String> sort(List<String> textbooks) {
        return textbooks.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }
}
