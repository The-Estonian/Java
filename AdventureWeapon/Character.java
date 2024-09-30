import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();
    private Weapon weapon;

    public Character(String name, int maxHealth, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
        this.weapon = weapon;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    protected void setCurrentHealth(int value) {
        this.currentHealth = value;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public String toString() {
        return this.currentHealth == 0 ? String.format("%s : KO", this.name)
                : String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    public abstract void takeDamage(int damage);

    public abstract void attack(Character character);

    public static String printStatus() {
        if (allCharacters.size() == 0) {
            return """
                    ------------------------------------------
                    Nobody's fighting right now !
                    ------------------------------------------
                    """;
        } else {
            StringBuilder result = new StringBuilder();
            result.append("------------------------------------------\n");
            result.append("Characters currently fighting :\n");
            for (Character character : allCharacters) {
                result.append(" - ").append(character.toString()).append("\n");
            }
            result.append("------------------------------------------\n");

            return result.toString();
        }
    }

    public static Character fight(Character char1, Character char2) {
        while (char1.getCurrentHealth() > 0 && char2.getCurrentHealth() > 0) {
            char1.attack(char2);
            if (char2.getCurrentHealth() <= 0) {
                return char1;
            }
            char2.attack(char1);
            if (char1.getCurrentHealth() <= 0) {
                return char2;
            }
        }
        return null;
    }
}