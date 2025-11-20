
import classes.*;


public class Main {

    public static void main(String[] args) throws Exception {

//         List<Shape> shapes = new ArrayList<>();
//         shapes.add(new Circle(23));
//         shapes.add(new Rectangle(10, 12));
//         shapes.add(new Triangle(2, 6));
//         for (Shape d : shapes) {
//             System.out.println(d.calculateArea());
//         }
// // ============================= challenge 2 ====================================
//         List<Employee> employees = new ArrayList<>();
//         employees.add(new HourlyEmployee("mohammed", 20, 12));
//         employees.add(new CommissionEmployee("mehdi", 120, 4));
//         employees.add(new Manager("boos", 2000));
//         for (Employee emp : employees) {
//             System.out.println("name: " + emp.getName() + " " + "total: " + emp.calculateSalary());
//         }
//     // ============================= challenge 3 ====================================
//         List<Animal> animals = new ArrayList<>();
//         animals.add(new dog());
//         animals.add(new Cat());
//             for (Animal a : animals) {
//                 a.makeSound();
//                 a.eat();
//             }
// //     // ============================= challenge 4 ====================================
//         CheckingAccount acc = new CheckingAccount(1, 20000);
//         SavingsAccount acc1 = new SavingsAccount(2, 1000);

//         acc.diposet(1000);
//         System.out.println("Checking balance after deposit: " + acc.getBalance());

//         acc.withdraw(5000);
//         acc.withdraw(25000);
//         System.out.println("Checking balance after withdrawals: " + acc.getBalance());

//         System.out.println("Savings balance before interest: " + acc1.getBalance());
//         acc1.applyInterest();
//         System.out.println("Savings balance after interest: " + acc1.getBalance());

// //     // ============================= challenge 5 ====================================
            Payment card = new CardPayment();
            Payment cash = new CashPayment();
            Payment tran = new TransferPayment();

            card.processPayment(card, 1000);
            cash.processPayment(cash, 5000);
            tran.processPayment(tran, 6000);
//   // ============================= challenge 6 ====================================

        Car car1 = new Car("kia", "master", 20, 0.3);
        Truck truck = new Truck("man", "2020", 100, 0.8);
        Motorcycle moto = new Motorcycle("becan", "33", 7, 0.3);

        car1.start();
        truck.start();
        moto.start();

        System.out.println(car1.Autonomie());
        System.err.println(truck.Autonomie());
        System.out.println(moto.Autonomie());

    }
}
