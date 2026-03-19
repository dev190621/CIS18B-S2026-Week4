package edu.norcocollege.cis18b.weekx.mini03;

public class AlertValidatorDemo {

    public static void validateAlert(Alert alert) throws InvalidAlertException {
        if (alert.getMessage() == null || alert.getMessage().isBlank()) {
            throw new InvalidAlertException("Alert message cannot be null or blank.");
        }

        if (alert.getLevel() == null) {
            throw new InvalidAlertException("Alert level cannot be null.");
        }
    }

    public static void main(String[] args) {
        Alert alert = new Alert(1, "", null);

        try {
            validateAlert(alert);
            System.out.println("Alert is valid.");
        } catch (InvalidAlertException e) {
            System.out.println("Invalid alert: " + e.getMessage());
        }
    }
}