package edu.norcocollege.cis18b.weekx.mini10;

public class FailingAlertRepository implements AlertRepository {
    @Override
    public void save(Alert alert) throws AlertStorageException {
        throw new AlertStorageException("Repository failed.", new RuntimeException("Simulated storage error"));
    }
}