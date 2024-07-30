package Creational.Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        config.loadConfigurations(); // Configurations loaded.
    }
}
