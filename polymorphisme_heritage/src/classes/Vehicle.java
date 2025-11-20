package classes;

public class Vehicle {

    private String brand;
    private String model;
    private double fuelCapacity;
    private double consumptionPerKm;

    public Vehicle(String brand, String model, double fuelCapacity, double consumptionPerKm) {
        this.brand = brand;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.consumptionPerKm = consumptionPerKm;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getConsumptionPerKm() {
        return consumptionPerKm;
    }

    public void setConsumptionPerKm(double consumptionPerKm) {
        this.consumptionPerKm = consumptionPerKm;
    }

    public void start() {
        System.out.println("start 3an 3an");
    }
    public double  Autonomie(){
        return fuelCapacity / consumptionPerKm;
    }
}
