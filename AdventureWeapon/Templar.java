public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int heal, int shield, Weapon weapon) {
        super(name, maxHealth, weapon);
        this.healCapacity = heal;
        this.shield = shield;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    // Heal
    @Override
    public void heal(Character character) {
        int newHealth = character.getCurrentHealth() + this.healCapacity;
        character.setCurrentHealth(Math.min(newHealth, character.getMaxHealth()));
    }

    // Get Shield
    @Override
    public int getShield() {
        return this.shield;
    }

    // Take damage
    @Override
    public void takeDamage(int damage) {
        damage = damage - this.shield;
        if (damage > 0) {
            if (this.getCurrentHealth() - damage < 0) {
                this.setCurrentHealth(0);
            } else {
                this.setCurrentHealth(this.getCurrentHealth() - damage);
            }
        }
    }

    // Attack
    @Override
    public void attack(Character character) {
        this.heal(this);
        if (this.getWeapon() != null) {
            character.takeDamage(this.getWeapon().getDamage());
        } else {
            character.takeDamage(6);
        }
    }

    @Override
    public String toString() {
        return (this.getCurrentHealth() == 0
                ? String.format(
                        "%s has been beaten, even with its %d shield. So bad, it could heal %d HP.",
                        this.getName(), this.shield,
                        this.healCapacity)
                : String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d.",
                        this.getName(),
                        this.getCurrentHealth(), this.getHealCapacity(), this.shield))
                + (this.getWeapon() != null
                        ? " He has the weapon " + this.getWeapon().toString()
                        : "");
    }
}
