import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> returnSet = new HashSet<>();
        for (Integer integer : set1) {
            returnSet.add(integer);
        }
        for (Integer integer : set2) {
            returnSet.add(integer);
        }

        return returnSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> returnSet = new HashSet<>();
        for (Integer integer : set1) {
            if (set2.contains(integer)) {
                returnSet.add(integer);
            }
        }
        return returnSet;
    }
}