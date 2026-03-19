package edu.norcocollege.cis18b.weekx.mini09;

public class LoggingAlertHandlerDecorator implements AlertHandler {
    private final AlertHandler wrappedHandler;

    public LoggingAlertHandlerDecorator(AlertHandler wrappedHandler) {
        this.wrappedHandler = wrappedHandler;
    }

    @Override
    public void handle(Alert alert) {
        System.out.println("LOG: Starting alert handling...");
        wrappedHandler.handle(alert);
        System.out.println("LOG: Finished alert handling...");
    }
}