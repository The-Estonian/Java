import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> change = new ArrayList<>();
        List<Integer> coinList = new ArrayList<>(coins);
        Collections.sort(coinList, Collections.reverseOrder());
        for (int coin : coinList) {
            while (amount >= coin) {
                amount -= coin;
                change.add(coin);
            }
        }
        return change;
    }
}