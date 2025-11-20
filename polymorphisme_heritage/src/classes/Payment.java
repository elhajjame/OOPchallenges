package classes;

public class Payment {
    public void makePayment(double amount){
        System.out.println("normal Payment");
    }

    public void processPayment(Payment type, double amount){
        type.makePayment(amount);
    }
}
