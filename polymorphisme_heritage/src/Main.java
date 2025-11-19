import classes.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(23));
        shapes.add(new Rectangle(10, 12));
        shapes.add(new Triangle(2, 6));

        for (Shape d : shapes) {
            System.out.println(d.calculateArea());
        }

// ============================= challenge 2 ====================================

        List<Employee> employees = new ArrayList<>();
        employees.add(new HourlyEmployee("mohammed", 20, 12));
        employees.add(new CommissionEmployee("mehdi", 120, 4));
        employees.add(new Manager("boos", 2000));

        for (Employee emp : employees) {
            System.out.println("name: " + emp.getName() + " " + "total: " + emp.calculateSalary());
        }
    }
}

