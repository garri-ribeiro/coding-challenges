// [6kyu] Find odd int
// https://www.codewars.com/kata/54da5a58ea159efa38000836
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {

        return Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(value -> (value.getValue() % 2) == 1)
                .mapToInt(Map.Entry::getKey)
                .sum();
    }
}