package allClasses;

public class BankCard {
    private int cardNumber;
    private String expDate;
    private int cvv;

    public BankCard(int cardNumber, String expDate, int cvv){
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        if(cvv >= 100 && cvv <= 999){
            this.cvv = cvv;
        }else {throw new IllegalArgumentException("Invalid CVV! Must be a 3-digit number.");}
    }

    public int getCardNumber(){
        return this.cardNumber;
    }
    public String getExpDate(){
        return this.expDate;
    }
    public int getCvv(){
        return this.cvv;
    }

    public void displayCardInfo(){
        System.out.println("---- card info ----");
        System.out.println("card number: " + cardNumber);
        System.out.println("expiration date: " + expDate);
        System.out.println("cvv: " + cvv);
    }
}