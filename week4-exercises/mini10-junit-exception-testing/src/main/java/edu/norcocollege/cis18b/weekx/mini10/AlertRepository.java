package edu.norcocollege.cis18b.weekx.mini10;

public interface AlertRepository {
    void save(Alert alert) throws AlertStorageException;
}