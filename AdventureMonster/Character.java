import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        allCharacters.add(this);
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public void resetHealth() {
        this.currentHealth = this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.currentHealth == 0 ? String.format("%s : KO", this.name)
                : String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
    }

    public void takeDamage(int damage) {
        if (this.currentHealth - damage < 0) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= damage;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }

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