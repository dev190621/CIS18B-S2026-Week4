package edu.norcocollege.cis18b.weekx.mini02;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Opening alert stream...");
            throw new RuntimeException("Simulated alert stream failure");
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Closing alert stream...");
        }
    }
}