package oopproject;

public class VehicleTracker extends Thread {
    private final Vehicle vehicle;
    private volatile boolean running = true;

    public VehicleTracker(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void run() {
        while (running) {
            System.out.println("Tracking: " + vehicle.getRegistrationNumber());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Tracker interrupted for vehicle: " + vehicle.getRegistrationNumber());
                Thread.currentThread().interrupt(); // Best practice
            }
        }
        System.out.println("Stopped tracking: " + vehicle.getRegistrationNumber());
    }

    public void stopTracking() {
        running = false;
    }
}
