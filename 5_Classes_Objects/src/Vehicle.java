
public class Vehicle {

    private String type;
    private String model;
    private double power;
    private double fuelConsumption;
    private int yearProduced;
    private double distance;
    private String licenseNo;
    private double weight;
    private String colour;

    public Vehicle(String type, String model, double power, double fuelConsumption, int yearProduced, double distance, String licenseNo) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.distance = distance;
        this.licenseNo = licenseNo;
    }

    public Vehicle(String type, String model, double power, double fuelConsumption, int yearProduced, double distance, String licenseNo, double weight) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.distance = distance;
        this.licenseNo = licenseNo;
        this.weight = weight;
    }

    public Vehicle(String type, String model, double power, double fuelConsumption, int yearProduced, double distance, String licenseNo, String colour) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.distance = distance;
        this.licenseNo = licenseNo;
        this.colour = colour;
    }

    public Vehicle(String type, String model, double power, double fuelConsumption, int yearProduced, double distance, String licenseNo, double weight, String colour) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.yearProduced = yearProduced;
        this.distance = distance;
        this.licenseNo = licenseNo;
        this.weight = weight;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getDistance() {
        return distance;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String getModel() {
        return model;
    }

    public double getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    double calculateTripPrice(double fuelPrice) {
        return this.fuelConsumption * this.distance * fuelPrice / 100;
    }

    double getInsurancePrice() {
        double typeCoefficient = 0;
        switch (this.type) {
            case "car":
                typeCoefficient = 1;
                break;
            case "suv":
                typeCoefficient = 1.12;
                break;
            case "truck":
                typeCoefficient = 1.20;
                break;
            case "motorcycle":
                typeCoefficient = 1.50;
                break;
            default:
                break;
        }
        return (0.16 * this.power) * (1.25 * (2016 - this.yearProduced)) * (0.05 * this.fuelConsumption) * typeCoefficient;
    }
}
