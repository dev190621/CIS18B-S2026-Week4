package edu.norcocollege.cis18b.weekx.mini04;

public class AlertValidationApp {
    public static void main(String[] args) {
        Alert validAlert = new Alert(1, "CPU usage high", AlertLevel.HIGH);
        Alert invalidAlert = new Alert(2, "   ", null);

        try {
            AlertValidator.validate(validAlert);
            System.out.println("Valid alert passed validation.");
        } catch (InvalidAlertException e) {
            System.out.println("Valid alert failed: " + e.getMessage());
        }

        try {
            AlertValidator.validate(invalidAlert);
            System.out.println("Invalid alert passed validation.");
        } catch (InvalidAlertException e) {
            System.out.println("Invalid alert rejected: " + e.getMessage());
        }
    }
}