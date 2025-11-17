import allClasses.Person;
import allClasses.Passport;

public class Main {
  public static void main(String[] args) {
    Person p = new Person("mehdi", 24);
    Passport passport = new Passport("AB1234", "moroccan", "01/15/2027");
    
    p.assignPassport(passport);
    p.displayInfo();
  }
}