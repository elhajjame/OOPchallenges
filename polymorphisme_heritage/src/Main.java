
import classes.Circle;
import classes.Rectangle;
import classes.Shape;
import classes.Triangle;
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
    }
}
