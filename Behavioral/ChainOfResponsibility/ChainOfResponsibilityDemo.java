package Behavioral.ChainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        SupportHandler lowLevelHandler = new LowLevelSupportHandler();
        SupportHandler highLevelHandler = new HighLevelSupportHandler();

        lowLevelHandler.setNext(highLevelHandler);

        lowLevelHandler.handleRequest("low priority issue"); // Handled by LowLevelSupportHandler.
        lowLevelHandler.handleRequest("high priority issue"); // Handled by HighLevelSupportHandler.
    }
}
