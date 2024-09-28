
import java.util.ArrayList;
import java.util.List;

public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);

    }

    @Override
    public String toString() {
        return getCurrentHealth() == 0 ? String.format("%s is a monster and is dead",
                getName())
                : String.format("%s is a monster with %d HP", getName(), getCurrentHealth());
    }

}