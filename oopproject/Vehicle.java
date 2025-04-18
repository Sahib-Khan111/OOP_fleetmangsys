package oopproject;

public class Vehicle {
    private String registrationNumber;
    private String model;
    private int capacity;

    public Vehicle(String registrationNumber, String model, int capacity) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.capacity = capacity;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
}

class Truck extends Vehicle {
    private int loadLimit;

    public Truck(String registrationNumber, String model, int capacity, int loadLimit) {
        super(registrationNumber, model, capacity);
        this.loadLimit = loadLimit;
    }

    public int getLoadLimit() {
        return loadLimit;
    }
}

class Car extends Vehicle {
    private int passengerSeats;

    public Car(String registrationNumber, String model, int capacity, int passengerSeats) {
        super(registrationNumber, model, capacity);
        this.passengerSeats = passengerSeats;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasCarrierBox;

    public Motorcycle(String registrationNumber, String model, int capacity, boolean hasCarrierBox) {
        super(registrationNumber, model, capacity);
        this.hasCarrierBox = hasCarrierBox;
    }

    public boolean isHasCarrierBox() {
        return hasCarrierBox;
    }
}


