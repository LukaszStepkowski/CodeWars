import java.util.List;
import java.util.stream.Collectors;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        List<Integer> collect = listOfNumbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        return collect;
    }
}