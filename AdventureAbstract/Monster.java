
import java.util.ArrayList;
import java.util.List;

public class Monster extends Character {

    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    @Override
    public void takeDamage(int damage) {
        damage = (int) Math.floor(damage * 0.8);
        if (this.getCurrentHealth() - damage < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - damage);
        }
    }

    @Override
    public void attack(Character character) {
        character.takeDamage(7);
    }

    @Override
    public String toString() {
        return getCurrentHealth() == 0 ? String.format("%s is a monster and is dead",
                getName())
                : String.format("%s is a monster with %d HP", getName(), getCurrentHealth());
    }

}