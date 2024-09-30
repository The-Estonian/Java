public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int heal) {
        super(name, maxHealth);
        this.healCapacity = heal;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character character) {
        int newHealth = character.getCurrentHealth() + this.healCapacity;
        character.setCurrentHealth(Math.min(newHealth, character.getMaxHealth()));
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0
                ? String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(),
                        this.healCapacity)
                : String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(),
                        this.getCurrentHealth(),
                        this.healCapacity);
    }

}
