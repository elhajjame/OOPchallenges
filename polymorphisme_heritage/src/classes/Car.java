package classes;

public class Car extends Vehicle {

    public Car(String brand, String model, double fuelCapacity, double consumptionPerKm) {
        super(brand, model, fuelCapacity, consumptionPerKm);
    }
    public void start(){
        System.out.println("starts with a key");
    }
}
