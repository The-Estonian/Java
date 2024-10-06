public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int heal, Weapon weapon) {
        super(name, maxHealth, weapon);
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
    public void takeDamage(int damage) {
        if (this.getCurrentHealth() - damage < 0) {
            this.setCurrentHealth(0);
        } else {
            this.setCurrentHealth(this.getCurrentHealth() - damage);
        }
    }

    @Override
    public void attack(Character character) {
        this.heal(this);
        this.heal(this);
        if (this.getWeapon() != null) {
            character.takeDamage(this.getWeapon().getDamage());
        } else {
            character.takeDamage(10);
        }
    }

    @Override
    public String toString() {
        return (this.getCurrentHealth() == 0
                ? String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName(),
                        this.healCapacity)
                : String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName(),
                        this.getCurrentHealth(),
                        this.healCapacity))
                + (this.getWeapon() != null
                        ? " He has the weapon " + this.getWeapon().toString()
                        : "");
    }

}
