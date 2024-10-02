import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class StreamMap {
    public static Integer sumOfStringLength(Stream<String> s) {
        return s.mapToInt(String::length)
                .sum();
    }

    public static List<String> upperCaseAllString(Stream<String> s) {
        return s.map(item -> item.toUpperCase()).collect(Collectors.toList());
    }

    public static Set<Integer> uniqIntValuesGreaterThan42(Stream<Double> s) {
        return s.filter(item -> item > 42)
                .map(item -> (int) Math.floor(item))
                .collect(Collectors.toSet());
    }
}