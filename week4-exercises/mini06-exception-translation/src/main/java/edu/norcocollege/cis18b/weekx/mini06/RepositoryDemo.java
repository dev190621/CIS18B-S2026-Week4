package edu.norcocollege.cis18b.weekx.mini06;

public class RepositoryDemo {
    public static void main(String[] args) {
        AlertRepository repository = new InMemoryAlertRepository();
        Alert alert = new Alert(1, "Disk almost full");

        try {
            repository.save(alert);
        } catch (AlertStorageException e) {
            System.out.println("Translated exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }
}