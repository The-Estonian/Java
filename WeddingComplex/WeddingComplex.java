import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> groupA,
            Map<String, List<String>> groupB) {
        Map<String, String> coupleMap = new HashMap<>();
        Map<String, String> reverseCoupleMap = new HashMap<>();
        Map<String, Integer> proposalCount = new HashMap<>();
        Queue<String> freeGroupA = new LinkedList<>(groupA.keySet());

        while (!freeGroupA.isEmpty()) {
            String memberA = freeGroupA.poll();
            List<String> preferencesA = groupA.get(memberA);
            int count = proposalCount.getOrDefault(memberA, 0);
            String preferredB = preferencesA.get(count);
            proposalCount.put(memberA, count + 1);

            if (!reverseCoupleMap.containsKey(preferredB)) {
                coupleMap.put(memberA, preferredB);
                reverseCoupleMap.put(preferredB, memberA);
            } else {
                String currentPartner = reverseCoupleMap.get(preferredB);
                List<String> preferencesB = groupB.get(preferredB);

                if (preferencesB.indexOf(memberA) < preferencesB.indexOf(currentPartner)) {
                    coupleMap.remove(currentPartner);
                    freeGroupA.add(currentPartner);

                    coupleMap.put(memberA, preferredB);
                    reverseCoupleMap.put(preferredB, memberA);
                } else {
                    freeGroupA.add(memberA);
                }
            }
        }

        return coupleMap;
    }
}
