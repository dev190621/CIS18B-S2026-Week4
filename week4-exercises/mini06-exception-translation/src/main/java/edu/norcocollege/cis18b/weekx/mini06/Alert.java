package edu.norcocollege.cis18b.weekx.mini06;

public class Alert {
    private int id;
    private String message;

    public Alert(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}