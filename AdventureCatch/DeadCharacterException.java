public class DeadCharacterException extends Exception {
    private Character character;

    public DeadCharacterException(Character character) {
        this.character = character;
    }

    public String getMessage(){
        return String.format("The %s %s is dead.", this.character.adventureClass, this.character.getName());
    }
}
