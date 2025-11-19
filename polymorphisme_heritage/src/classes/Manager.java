package classes;

public class Manager extends Employee{
    double bonus;

    public Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }
}
