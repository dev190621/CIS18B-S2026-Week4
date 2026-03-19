package edu.norcocollege.cis18b.weekx.mini08;

public class LogAlertObserver implements AlertObserver {
    @Override
    public void onAlert(Alert alert) {
        System.out.println("LOG: Alert recorded -> " + alert.getMessage());
    }
}