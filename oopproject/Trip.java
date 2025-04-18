package oopproject;

public class Trip {
    private Vehicle vehicle;
    private Driver driver;
    private Route route;

    public Trip(Vehicle vehicle, Driver driver, Route route) {
        this.vehicle = vehicle;
        this.driver = driver;
        this.route = route;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Driver getDriver() {
        return driver;
    }

    public Route getRoute() {
        return route;
    }
    
    public void startTrip() {
        System.out.println("Trip started: " + vehicle.getRegistrationNumber() +
                           " driven by " + driver.getName() +
                           " from " + route.getStartLocation() +
                           " to " + route.getDestination() +
                           " (" + route.getDistance() + " km)");
    }

}

class Route {
    private String startLocation;
    private String destination;
    private double distance;

    public Route(String startLocation, String destination, double distance) {
        this.startLocation = startLocation;
        this.destination = destination;
        this.distance = distance;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistance() {
        return distance;
    }
}
