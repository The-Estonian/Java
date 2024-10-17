public class Excalibur {
    // Private static instance of Excalibur (Singleton)
    private static Excalibur INSTANCE;

    // Instance variable for the name
    private String name;

    // Private constructor to prevent instantiation from other classes
    private Excalibur(String name) {
        this.name = name;
    }

    // Public static method to provide access to the singleton instance
    public static Excalibur getInstance() {
        if (INSTANCE == null) {
            // Instantiate the class if it's not already instantiated
            INSTANCE = new Excalibur("Sword");
        }
        return INSTANCE;
    }

    // Public method to return the name of the sword
    public String getName() {
        return this.name;
    }
}