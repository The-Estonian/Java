public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int heal, int shield) {
        super(name, maxHealth);
        this.healCapacity = heal;
        this.shield = shield;
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
    public int getShield() {
        return this.shield;
    }

    @Override
    public String toString() {
        return this.getCurrentHealth() == 0
                ? String.format(
                        "%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                        this.getName(), this.shield,
                        this.healCapacity)
                : String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                        this.getName(),
                        this.getCurrentHealth(), this.getHealCapacity(), this.shield);
    }
}
