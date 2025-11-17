
import allClasses.Account;
import allClasses.BankCard;
import allClasses.Passport;
import allClasses.Person;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("mehdi", 24);
        Passport passport = new Passport("AB1234", "moroccan", "01/15/2027");

        p.assignPassport(passport);
        p.displayInfo();
        System.out.println("-------------------------------------------------------------------------------");

        Account acc1 = new Account(123, "mehdi el hajjame", 999);
        try {

            BankCard card1 = new BankCard(0000, "01/01/2001", 211);
            acc1.assignBankCard(card1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating BankCard: " + e.getMessage());
        }
        acc1.accDisplayInfo();
        System.out.println("-------------------------------------------------------------------------------");

        Instructor inst = new Instructor(1, "mehdi", "java");

        Course course1 = new Course(1, " java course ", " learn java ");
        Course course2 = new Course(2, " javascript course ", " learn javajavascript ");
        Course course3 = new Course(3, " php course ", " learn php ");
        
        inst.addcours(course1);
        inst.addcours(course2);
        inst.addcours(course3);

        inst.displayCourses();
      }

}
