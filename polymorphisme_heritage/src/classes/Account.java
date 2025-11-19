package classes;

public class Account {
    double balance = 0;
    double number;

    public Account(double  number) {
        this.number = number;
    }

    public void diposet(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double  number) {
        this.number = number;
    }

}
