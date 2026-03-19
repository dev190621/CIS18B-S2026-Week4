package edu.norcocollege.cis18b.weekx.mini08;

public class EmailAlertObserver implements AlertObserver {
    @Override
    public void onAlert(Alert alert) {
        System.out.println("EMAIL: Sending email for alert -> " + alert.getMessage());
    }
}