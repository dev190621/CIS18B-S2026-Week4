package edu.norcocollege.cis18b.weekx.mini10;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAlertRepository implements AlertRepository {
    private final List<Alert> storedAlerts = new ArrayList<>();

    @Override
    public void save(Alert alert) throws AlertStorageException {
        storedAlerts.add(alert);
    }

    public List<Alert> getStoredAlerts() {
        return storedAlerts;
    }
}