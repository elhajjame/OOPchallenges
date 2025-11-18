
import allclasses.Order;
import allclasses.Product;

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

        System.out.println("-------------------------------------------------------------------------------");


        Student s1 = new Student(1, "mehdi");


        CourseStd c1 = new CourseStd(1, "java");

        s1.enroll(c1);
        c1.addStudent(s1);

        System.out.println("course of "+s1.getName()+":");
         c1.displayCourses();

        System.out.println( +c1.getId()+ " title of the course: " + c1.getTitle() + ":"); s1.displayStudents();
    }

    Order ord1 = new Order(1);
    Product p1 = new Product("phone", 100, 3);
     Product p2 = new Product("laptop", 40, 5);
      Product p3 = new Product("mouse", 32, 99);

}
