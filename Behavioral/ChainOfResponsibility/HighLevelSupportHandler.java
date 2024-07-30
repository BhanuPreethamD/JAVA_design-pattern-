package Behavioral.ChainOfResponsibility;

public class HighLevelSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (canHandle(request)) {
            System.out.println("Handled by HighLevelSupportHandler.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }

    private boolean canHandle(String request) {
        return request.contains("high");
    }
}
