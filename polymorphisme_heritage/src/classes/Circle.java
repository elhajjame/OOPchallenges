package classes;

public class Circle extends Shape {

    private double redios;

    public Circle(double redios) {
        this.redios = redios;
    }

    public double getRedios() {
        return redios;
    }

    public void setRedios(double redios) {
        this.redios = redios;
    }

    @Override
    public double calculateArea() {
        return Math.PI * redios * redios;
    }

}
