package classes;

public class CardPayment extends Payment {
    public void makePayment(double amount){
        System.out.println("paid " + amount + " " + " by card");
    }
}
