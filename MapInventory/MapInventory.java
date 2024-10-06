import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        return inventory.get(productId) != null ? inventory.get(productId) : -1;
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> keys = new ArrayList<>();

        for (Map.Entry<String, Integer> item : inventory.entrySet()) {
            if (item.getValue() == price) {
                keys.add(item.getKey());
            }
        }
        return keys;
    }
}