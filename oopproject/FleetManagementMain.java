package oopproject;

public class FleetManagementMain {
	    public static void main(String[] args) {

	        // Create Vehicles
	        Truck truck1 = new Truck("TRK123", "Volvo FH", 5000, 20000);
	        Car car1 = new Car("CAR456", "Toyota Corolla", 5, 4);

	        // Create Drivers
	        Driver driver1 = new Driver("John Doe", "DL12345");
	        Driver driver2 = new Driver("Alice Smith", "DL67890");

	        // Create Routes
	        Route route1 = new Route("Warehouse A", "Customer B", 120.5);
	        Route route2 = new Route("Depot X", "Factory Y", 300.0);

	        // Create Trips
	        Trip trip1 = new Trip(truck1, driver1, route1);
	        Trip trip2 = new Trip(car1, driver2, route2);

	        // Simulate Starting Trips
	        System.out.println("Starting Trips:");
	        trip1.startTrip(); // You need to implement startTrip() in Trip class
	        trip2.startTrip();

	        // Start tracking vehicles in background threads
	        VehicleTracker tracker1 = new VehicleTracker(truck1);
	        VehicleTracker tracker2 = new VehicleTracker(car1);

	        tracker1.start();
	        tracker2.start();

	        // Simulate app running for some time while trackers are active
	        try {
	            Thread.sleep(15000);  // Let tracking threads run for 15 seconds
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        // Stop the trackers after 15 seconds
	        tracker1.stopTracking();
	        tracker2.stopTracking();

	        try {
	            tracker1.join();
	            tracker2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Optional: Stop tracking (if you implement stop logic)
	        // tracker1.stopTracking();
	        // tracker2.stopTracking();

	        System.out.println("Fleet Management System shutting down...");
	    }
	}

