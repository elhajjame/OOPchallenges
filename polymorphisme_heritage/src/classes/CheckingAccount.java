package classes;

public class CheckingAccount extends Account {
    private double limit;

    public CheckingAccount(double  number, double limit) {
        super(number);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    
    public void withdraw(double amount){
        if(balance - amount < limit){
            balance -= amount;
            System.out.println("Withdrawn (Compte Courant): " + amount);
        }else{System.out.println("Withdrawal refused");}
    }
    
}
