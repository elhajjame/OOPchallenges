package classes;

public class Truck extends Vehicle {

    public Truck(String brand, String model, double fuelCapacity, double consumptionPerKm) {
        super(brand, model, fuelCapacity, consumptionPerKm);
    }

    public void start() {
        System.out.println("needs more power, maybe a warming process");
    }
}
