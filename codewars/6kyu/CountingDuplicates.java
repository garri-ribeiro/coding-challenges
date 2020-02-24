// [6kyu] Counting Duplicates
// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/java

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        List<Character> chars = text.toLowerCase().chars()
                .mapToObj(e->(char)e).collect(Collectors.toList());

        Map<Character, Long> counted = chars.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long total = counted.entrySet()
                .stream()
                .filter(map -> map.getValue() > 0)
                .count();

        return (int) total;
    }
}