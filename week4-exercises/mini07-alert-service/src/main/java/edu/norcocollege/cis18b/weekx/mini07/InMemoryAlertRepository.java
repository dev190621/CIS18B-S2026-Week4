package edu.norcocollege.cis18b.weekx.mini07;

public class InMemoryAlertRepository implements AlertRepository {
    @Override
    public void save(Alert alert) throws AlertStorageException {
        try {
            throw new RuntimeException("Database unavailable");
        } catch (RuntimeException e) {
            throw new AlertStorageException("Failed to store alert.", e);
        }
    }
}