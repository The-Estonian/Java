
import java.util.ArrayList;
import java.util.List;

public class Monster extends Character {

    public Monster(String name, int maxHealth, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.adventureClass = "monster";
    }

    @Override
    public void takeDamage(int damage) throws DeadCharacterException {
        if (!this.isAlive) {
            throw new DeadCharacterException(this);
        }
        damage = (int) Math.floor(damage * 0.8);
        if (this.getCurrentHealth() - damage < 0) {
            this.setCurrentHealth(0);
            this.isAlive = false;
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - damage);
        }
    }

    @Override
    public void attack(Character character) throws DeadCharacterException {
        if (!this.isAlive) {
            throw new DeadCharacterException(this);
        }
        if (this.getWeapon() != null) {
            character.takeDamage(this.getWeapon().getDamage());
        } else {
            character.takeDamage(7);
        }
    }

    @Override
    public String toString() {
        return (getCurrentHealth() == 0 ? String.format("%s is a monster and is dead.",
                getName())
                : String.format("%s is a monster with %d HP", getName(), getCurrentHealth())) + (this.getWeapon() != null
                        ? " He has the weapon " + this.getWeapon().toString(): "");
    }

}