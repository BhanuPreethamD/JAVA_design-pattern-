package Creational.Singleton;

public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {
        // Private constructor to prevent instantiation
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void loadConfigurations() {
        // Load configuration settings
        System.out.println("Configurations loaded.");
    }
}
