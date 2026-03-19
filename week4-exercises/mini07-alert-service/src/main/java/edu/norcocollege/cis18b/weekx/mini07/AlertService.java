package edu.norcocollege.cis18b.weekx.mini07;

public class AlertService {
    private final AlertRepository repository;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
    }

    public void processAlert(Alert alert)
            throws InvalidAlertException, AlertStorageException, AlertProcessingException {
        try {
            AlertValidator.validate(alert);
            repository.save(alert);
            System.out.println("Alert processed successfully.");
        } catch (InvalidAlertException | AlertStorageException e) {
            throw e;
        } catch (Exception e) {
            throw new AlertProcessingException("Unexpected processing error.", e);
        }
    }
}