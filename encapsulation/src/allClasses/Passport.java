package allClasses;

public class Passport {
   private String number;
   private String nationality;
   private String expDate;

    public Passport(String number, String nationlity, String expDate){
        this.number = number;
        this.nationality = nationlity;
        this.expDate = expDate;
    }

    public String getNumber(){
        return this.number;
    }

    public String getNationality(){
        return this.nationality;
    }

    public String getExpDate(){
        return this.expDate;
    }

    public void displayPassInfo(){
        System.out.println("passport number: " + number);
        System.out.println("nationality: " + nationality);
        System.out.println("expiration date: " + expDate);
    }
}
