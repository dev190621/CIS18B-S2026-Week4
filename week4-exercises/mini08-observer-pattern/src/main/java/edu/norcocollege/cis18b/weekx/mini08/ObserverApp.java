package edu.norcocollege.cis18b.weekx.mini08;

public class ObserverApp {
    public static void main(String[] args) {
        AlertService service = new AlertService();

        service.addObserver(new EmailAlertObserver());
        service.addObserver(new LogAlertObserver());

        Alert alert = new Alert(1, "Unauthorized login attempt", AlertLevel.HIGH);
        service.processAlert(alert);
    }
}