package edu.norcocollege.cis18b.weekx.mini10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AlertServiceTest {

    @Test
    void validAlertDoesNotThrow() {
        InMemoryAlertRepository repository = new InMemoryAlertRepository();
        AlertService service = new AlertService(repository);
        Alert alert = new Alert(1, "CPU spike detected", AlertLevel.HIGH);

        assertDoesNotThrow(() -> service.processAlert(alert));
    }

    @Test
    void blankMessageThrowsInvalidAlertException() {
        InMemoryAlertRepository repository = new InMemoryAlertRepository();
        AlertService service = new AlertService(repository);
        Alert alert = new Alert(1, "   ", AlertLevel.HIGH);

        assertThrows(InvalidAlertException.class, () -> service.processAlert(alert));
    }

    @Test
    void nullLevelThrowsInvalidAlertException() {
        InMemoryAlertRepository repository = new InMemoryAlertRepository();
        AlertService service = new AlertService(repository);
        Alert alert = new Alert(1, "Memory warning", null);

        assertThrows(InvalidAlertException.class, () -> service.processAlert(alert));
    }

    @Test
    void successfulAlertIsStored() throws Exception {
        InMemoryAlertRepository repository = new InMemoryAlertRepository();
        AlertService service = new AlertService(repository);
        Alert alert = new Alert(1, "Disk space low", AlertLevel.MEDIUM);

        service.processAlert(alert);

        assertEquals(1, repository.getStoredAlerts().size());
        assertEquals("Disk space low", repository.getStoredAlerts().get(0).getMessage());
    }

    @Test
    void failingRepositoryCausesAlertStorageException() {
        AlertService service = new AlertService(new FailingAlertRepository());
        Alert alert = new Alert(1, "Network timeout", AlertLevel.HIGH);

        assertThrows(AlertStorageException.class, () -> service.processAlert(alert));
    }
}