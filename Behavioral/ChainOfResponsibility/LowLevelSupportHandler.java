package Behavioral.ChainOfResponsibility;

public class LowLevelSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (canHandle(request)) {
            System.out.println("Handled by LowLevelSupportHandler.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }

    private boolean canHandle(String request) {
        return request.contains("low");
    }
}
