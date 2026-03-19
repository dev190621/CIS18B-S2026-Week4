package edu.norcocollege.cis18b.weekx.mini06;

public class InMemoryAlertRepository implements AlertRepository {

    @Override
    public void save(Alert alert) throws AlertStorageException {
        try {
            throw new RuntimeException("Low-level storage failure");
        } catch (RuntimeException e) {
            throw new AlertStorageException("Failed to save alert.", e);
        }
    }
}