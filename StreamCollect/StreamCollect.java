import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        return s.collect(Collectors.toMap(key -> Character.toUpperCase(key.charAt(0)), value -> {
            List<String> list = new ArrayList<>();
            list.add(value);
            return list;
        }, (existingList, newList) -> {
            existingList.addAll(newList);
            return existingList;
        }));
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        return s.collect(Collectors.groupingBy(
                num -> num % 4,
                Collectors.mapping(
                        num -> num,
                        Collectors.maxBy(Integer::compareTo))));
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        return "{" + s.sorted().collect(Collectors.joining(" # ")) + "}";
    }
}