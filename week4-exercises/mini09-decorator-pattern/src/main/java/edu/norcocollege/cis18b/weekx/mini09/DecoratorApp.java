package edu.norcocollege.cis18b.weekx.mini09;

public class DecoratorApp {
    public static void main(String[] args) {
        Alert alert = new Alert(1, "Temperature threshold exceeded");

        AlertHandler handler =
                new LoggingAlertHandlerDecorator(new BasicAlertHandler());

        handler.handle(alert);
    }
}