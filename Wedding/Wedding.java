import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        List<String> firstList = new ArrayList<>(first);
        List<String> secondList = new ArrayList<>(second);
        Map<String, String> returnMap = new HashMap<>();
        for (int i = 0; i < (firstList.size() > secondList.size() ? secondList.size() : firstList.size()); i++) {
            returnMap.put(firstList.get(i), secondList.get(i));
        }
        return returnMap;
    }
}
