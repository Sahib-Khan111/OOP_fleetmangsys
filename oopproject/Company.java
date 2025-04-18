package oopproject;

import java.util.List;

public class Company {
    private String companyName;
    private List<Driver> drivers;
    private List<Vehicle> fleet;

    public Company(String companyName, List<Driver> drivers, List<Vehicle> fleet) {
        this.companyName = companyName;
        this.drivers = drivers;
        this.fleet = fleet;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Vehicle> getFleet() {
        return fleet;
    }
}
