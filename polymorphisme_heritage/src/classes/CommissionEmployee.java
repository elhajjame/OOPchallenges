package classes;

public class CommissionEmployee extends Employee{
    int sales;
    double CommissionRate;
    
    public CommissionEmployee(String name, int salse, double commissionRate) {
        super(name);
        this.sales = salse;
        CommissionRate = commissionRate;
    }

    public int getSalse() {
        return sales;
    }

    public void setSalse(int salse) {
        this.sales = salse;
    }

    public double getCommissionRate() {
        return CommissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        CommissionRate = commissionRate;
        }

    public double calculateSalary(){
        return (sales * CommissionRate) + getBaseSalary();
    }
}
