package oopproject;

public class Driver {
    private String name;
    private String licenseNumber;

    // Constructor
    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for License Number
    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    // Display Driver Info
    public void displayInfo() {
        System.out.println("Driver Name: " + name);
        System.out.println("License Number: " + licenseNumber);
}
}

