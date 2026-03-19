package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidator {
    public static void validate(Alert alert) throws InvalidAlertException {
        if (alert == null) {
            throw new InvalidAlertException("Alert cannot be null.");
        }

        if (alert.getMessage() == null || alert.getMessage().isBlank()) {
            throw new InvalidAlertException("Alert message cannot be blank.");
        }

        if (alert.getLevel() == null) {
            throw new InvalidAlertException("Alert level cannot be null.");
        }
    }
}