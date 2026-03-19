package edu.norcocollege.cis18b.weekx.mini10;

public class AlertService {
    private final AlertRepository repository;

    public AlertService(AlertRepository repository) {
        this.repository = repository;
    }

    public void processAlert(Alert alert) throws InvalidAlertException, AlertStorageException {
        AlertValidator.validate(alert);
        repository.save(alert);
    }
}