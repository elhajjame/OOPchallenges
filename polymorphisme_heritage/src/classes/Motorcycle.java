package classes;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String model, double fuelCapacity, double consumptionPerKm) {
        super(brand, model, fuelCapacity, consumptionPerKm);
    }

    public void start() {
        System.out.println("start by kick or button");
    }

}
