package edu.norcocollege.cis18b.weekx.mini07;

public class AlertServiceApp {
    public static void main(String[] args) {
        AlertService service = new AlertService(new InMemoryAlertRepository());
        Alert alert = new Alert(1, "Server offline", AlertLevel.HIGH);

        try {
            service.processAlert(alert);
        } catch (InvalidAlertException e) {
            System.out.println("Validation failed: " + e.getMessage());
        } catch (AlertStorageException e) {
            System.out.println("Storage failed: " + e.getMessage());
        } catch (AlertProcessingException e) {
            System.out.println("Processing failed: " + e.getMessage());
        }
    }
}