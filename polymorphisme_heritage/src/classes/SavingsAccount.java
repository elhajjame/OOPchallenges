package classes;

public class SavingsAccount extends Account {
    private double fayda = 0.20;



    public SavingsAccount(double number, double fayda) {
        super(number);
        this.fayda = fayda;
    }

    public double getFayda() {
        return fayda;
    }

    public void setFayda(double fayda) {
        this.fayda = fayda;
    }

      public void applyInterest(){
        setBalance(getBalance() + (getBalance() * fayda));
        System.out.println("After interest: " + getBalance());
    }
}
