package allclasses;

public class Account {
    private int accNumber;
    private String ownerName;
    private double balance;
    private BankCard bankCard;

    public Account(int accNumber, String ownerName, double balance){
        this.accNumber = accNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void assignBankCard(BankCard card){
        bankCard = card;
    }

    public int getAccNumber(){
        return  this.accNumber;
    }
    public String getOwnerName(){
        return this.ownerName;
    }
    public double getBalance(){
        return this.balance;
    }

    public void accDisplayInfo(){
        System.out.println("---- account info ----");
        System.out.println("Account number: " + accNumber);
        System.out.println("Owner name: " + ownerName);
        System.out.println("Balance: " + balance);

        if (bankCard != null) {
            bankCard.displayCardInfo();
        }else{System.out.println("No bank card assigned");}

    }
}